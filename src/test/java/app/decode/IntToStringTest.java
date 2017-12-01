package app.decode;

import org.junit.Assert;
import org.junit.Test;

public class IntToStringTest {

    @Test
    public void testIntToString(){
        final IntToString intToString = new IntToString();
        final int w = 'w' << 24;
        final int space = ' ' << 16;
        final int n = 'n' << 8;
        final String s = intToString.toStr(w | space | n);
        Assert.assertEquals("w n", s);
    }

}