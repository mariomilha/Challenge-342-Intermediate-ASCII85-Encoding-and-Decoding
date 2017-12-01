package app.encode;

import app.utils.IStringSplitter;

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
                Arrays.stream(segments)
                        .mapToInt(converter::toInt)
                        .flatMap(decomposer::decompose)
                        .map(value -> value + 33)
                        .mapToObj(this::toAscii)
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        final String rawResult = stringBuilder.toString();
        return trimValue(toEncode, rawResult);
    }

    public String trimValue(String original, String rawResult) {
        final int toRemove = getNumberOfNullChar(original);
        return rawResult.substring(0, rawResult.length()- toRemove);
    }

    private int getNumberOfNullChar(String toEncode) {
        final int remainder = toEncode.length() % 4;
        return remainder == 0 ? 0 : 4 - remainder;
    }

    private char toAscii(final int code) {
        return (char)code;
    }

}
