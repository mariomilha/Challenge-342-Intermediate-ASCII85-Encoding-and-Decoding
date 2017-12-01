package app.decode;

import app.utils.DecomposedData;
import app.utils.IStringSplitter;

import java.util.stream.Stream;

public class DecoderASCII85 implements IDecoder {

    private IStringSplitter spliter;
    private IComposer composer;

    public DecoderASCII85(IStringSplitter spliter, IComposer composer) {
        this.spliter = spliter;
        this.composer = composer;
    }

    @Override
    public String decode(String value) {
        final String[] split = spliter.split(value, 5);
        return Stream.of(split)
                .map(String::toCharArray)
                .map(DecomposedData::new)
                .peek(decomposedData -> decomposedData.addAll(-33))
                .mapToInt(composer::compose)
                .mapToObj(this::bitToString)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    private String bitToString(int value) {
        return new String(new byte[]{
                (byte) (value >> 24),
                (byte) (value >> 16),
                (byte) (value >> 8),
                (byte) value});
    }

    private DecomposedData asd(String a) {
        final char[] chars = a.toCharArray();

        return new DecomposedData(chars);
    }
}
