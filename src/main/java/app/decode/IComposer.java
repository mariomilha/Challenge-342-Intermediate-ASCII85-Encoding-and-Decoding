package app.decode;

import app.utils.DecomposedData;

@FunctionalInterface
public interface IComposer {
    int compose(DecomposedData value);
}
