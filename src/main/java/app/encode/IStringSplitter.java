package app.encode;

@FunctionalInterface
public interface IStringSplitter {
    String[] split(String toSplit, int segmentSize);
}
