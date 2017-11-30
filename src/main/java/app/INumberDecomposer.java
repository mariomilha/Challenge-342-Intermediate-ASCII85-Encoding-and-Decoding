package app;

import java.util.stream.IntStream;



@FunctionalInterface
public interface INumberDecomposer {
    IntStream decompose(int toDecompose);
}