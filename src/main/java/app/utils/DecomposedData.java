package app.utils;

public class DecomposedData {

    private int c0;
    private int c1;
    private int c2;
    private int c3;
    private int c4;

    public DecomposedData(int c0, int c1, int c2, int c3, int c4) {
        this.c0 = c0;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    public DecomposedData(char[] chars) {
        this.c0 = (int) chars[0];
        this.c1 = (int) chars[1];
        this.c2 = (int) chars[2];
        this.c3 = (int) chars[3];
        this.c4 = (int) chars[4];
    }

    public void addAll(int data){
        this.c0 += data;
        this.c1 += data;
        this.c2 += data;
        this.c3 += data;
        this.c4 += data;
    }
}
