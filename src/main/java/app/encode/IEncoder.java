package app.encode;

@FunctionalInterface
public interface IEncoder {
    String encode(String toEncode);
}
