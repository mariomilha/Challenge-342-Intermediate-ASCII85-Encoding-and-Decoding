package app.utils;

import java.util.stream.IntStream;



public class Decompose85 implements INumberDecomposer {

    private static final int EIGTHY_FIVE_TO_THE_FORTH = 85*85*85*85;
    private static final int EIGTHY_FIVE_TO_THE_THIRTH = 85*85*85;
    private static final int EIGTHY_FIVE_TO_THE_SECOND = 85*85;
    private static final int EIGTHY_FIVE = 85;

    @Override
    public IntStream decompose(final int toDecompose) {
        int actualizedValue = toDecompose;
        int  firstParcel = actualizedValue / EIGTHY_FIVE_TO_THE_FORTH;
        actualizedValue -= EIGTHY_FIVE_TO_THE_FORTH * firstParcel;
        int  secondParcel = actualizedValue / EIGTHY_FIVE_TO_THE_THIRTH;
        actualizedValue -= EIGTHY_FIVE_TO_THE_THIRTH * secondParcel;
        int  thirthParcel = actualizedValue / EIGTHY_FIVE_TO_THE_SECOND;
        actualizedValue -= EIGTHY_FIVE_TO_THE_SECOND * thirthParcel;
        int  lastParcel = actualizedValue / EIGTHY_FIVE;
        actualizedValue -= EIGTHY_FIVE * lastParcel;
        return IntStream.of(firstParcel, secondParcel, thirthParcel, lastParcel, actualizedValue);
    }
}
