package app;

@FunctionalInterface
public interface IStringSplitter {
    String[] split(String toSplit, int segmentSize);
}
