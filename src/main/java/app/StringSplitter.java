package app;

public class StringSplitter implements IStringSplitter {

    @Override
    public String[] split(final String toSplit, final int segmentSize) {
        final int length = toSplit.length();
        final int numberOfSplits = (int) ((length / (double)segmentSize) + 0.5);
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
}
