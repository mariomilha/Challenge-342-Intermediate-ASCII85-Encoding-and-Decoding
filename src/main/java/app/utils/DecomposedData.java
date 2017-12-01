package app.utils;

public class DecomposedData {

    private char[] chars;

    public DecomposedData(char[] chars) {
        this.chars = chars;
    }

    public void addAll(int data){
        for (int i = 0; i < chars.length; i++) {
            chars[i] += data;
        }
    }

    public int getData(int i) {
        if(chars.length<=i){
            return 0;
        }
        return chars[i];
    }

 }
