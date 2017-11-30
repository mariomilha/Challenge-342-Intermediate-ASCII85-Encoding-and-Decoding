package app.utils;

public class StringSplitter implements IStringSplitter {

    @Override
    public String[] split(final String toSplit, final int segmentSize) {
        final int length = toSplit.length();
        final int numberOfSplits = getSplitNumber(segmentSize, length);
        String[] toReturn = new String[numberOfSplits];
        for (int i = 0; i<numberOfSplits; i++) {
            final int startPosition = i * segmentSize;
            final int endPosition = startPosition + segmentSize;
            if(endPosition <length){
                toReturn[i] = toSplit.substring(startPosition, endPosition);
            }else{
                toReturn[i] = toSplit.substring(startPosition, length);
            }
        }
        return toReturn;
    }

    private int getSplitNumber(int segmentSize, int length) {
        final int quotient = length / segmentSize;
        final int remainder = length % segmentSize;
        return remainder>0? quotient + 1 : quotient;
    }
}
