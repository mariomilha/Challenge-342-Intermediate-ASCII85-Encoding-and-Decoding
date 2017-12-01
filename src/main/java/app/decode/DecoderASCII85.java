package app.decode;

import app.utils.DecomposedData;
import app.utils.IStringSplitter;
import app.utils.Utils;

import java.util.stream.Stream;

public class DecoderASCII85 implements IDecoder {

    private static final int SPLIT_SIZE = 5;
    private IStringSplitter splitter;
    private IComposer composer;
    private IIntToString intToString;

    public DecoderASCII85(IStringSplitter splitter, IComposer composer, IIntToString intToString) {
        this.splitter = splitter;
        this.composer = composer;
        this.intToString = intToString;
    }

    @Override
    public String decode(String value) {
        final String toSplit = appendWithFiller(value);
        final String[] split = splitter.split(toSplit, SPLIT_SIZE);
        final String rawDecoded = Stream.of(split)
                .map(String::toCharArray)
                .map(DecomposedData::new)
                .peek(decomposedData -> decomposedData.addAll(-33))
                .mapToInt(composer::compose)
                .mapToObj(intToString::toStr)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        return Utils.trimValue(value, rawDecoded, SPLIT_SIZE);
    }

    private String appendWithFiller(String value) {
        final int remainder = value.length() % SPLIT_SIZE;
        final StringBuilder sb = new StringBuilder(value);
        if(remainder>0){
            final int numberOfusToAdd = SPLIT_SIZE - remainder;
            for (int j = 0; j < numberOfusToAdd; j++) {
                sb.append('u');
            }
        }
        return sb.toString();
    }

}
