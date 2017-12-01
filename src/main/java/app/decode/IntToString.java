package app.decode;

public class IntToString implements IIntToString {
    @Override
    public String toStr(int value) {
        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 3; i >= 0; i--) {
            final char newChar = (char) ((value >> (8*i)) & 0xFF);
            if(newChar>0){
                stringBuilder.append(newChar);
            }
        }
        return  stringBuilder.toString();
    }
}
