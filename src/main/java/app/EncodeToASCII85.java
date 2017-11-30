package app;

import java.util.Arrays;



public class EncodeToASCII85 implements IEncoder {

    private final IStringSplitter splitter;

    private final IStringToInt converter;

    private final INumberDecomposer decomposer;

    public EncodeToASCII85(IStringSplitter splitter, IStringToInt converter, INumberDecomposer decomposer){
        this.splitter = splitter;
        this.converter = converter;
        this.decomposer = decomposer;
    }

    @Override
    public String encode(final String toEncode) {
        final String[] segments = splitter.split(toEncode, 4);
        final StringBuilder stringBuilder =
                Arrays.stream(segments).mapToInt(converter::toInt)
                        .flatMap(decomposer::decompose)
                        .map(value -> value + 33)
                        .mapToObj(this::toAscii)
                        .collect(StringBuilder::new, StringBuilder::append, (sb1, sb2) -> sb1.append(sb2.toString()));
        return stringBuilder.toString();
    }

    private char toAscii(final int code) {
        return (char)code;
    }

}
