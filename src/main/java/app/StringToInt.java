package app;

import java.util.stream.IntStream;



public class StringToInt implements IStringToInt {

    private static final int STR_MAX_LENGTH = 4;

    @Override
    public int toInt(final String value) {
        if(value.length() > STR_MAX_LENGTH){
            throw new IllegalArgumentException("Parameter String with wrong size! required: "+ STR_MAX_LENGTH +", actual: " + value.length());
        }
        return IntStream.range(0, value.length())
                .map(i -> adjustBits(value, i))
                .reduce(0, (v1, v2) -> v1 | v2);
    }

    private int adjustBits(final String value, final int i) {
        final int bytePosition = ((STR_MAX_LENGTH - 1) - i) * 8;
        return (int)value.charAt(i)<< bytePosition;
    }
}
