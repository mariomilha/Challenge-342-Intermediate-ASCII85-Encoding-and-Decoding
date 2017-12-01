package app.utils;

public class Utils {

    public static String trimValue(String original, String rawResult, int size) {
        final int remainder = original.length() % size;
        final int toRemove = remainder == 0 ? 0 : size - remainder;
        return rawResult.substring(0, rawResult.length()- toRemove);
    }

}
