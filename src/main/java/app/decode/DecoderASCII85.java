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
        Stream.of(split)
                .map(String::toCharArray)
                .map(DecomposedData::new)
                .peek(decomposedData -> decomposedData.addAll(-33))
                .mapToInt(composer::compose);
        return null;
    }

    private String megaToStrin(int s) {

        return null;
    }

    private DecomposedData asd(String a) {
        final char[] chars = a.toCharArray();

        return new DecomposedData(chars);
    }
}
