package app;

import org.junit.Assert;
import org.junit.Test;



public class StringToIntTest{

    private static final int OFFSET_3_BYTES = 3 * 8;
    private static final int OFFSET_2_BYTES = 2 * 8;
    private static final int OFFSET_1_BYTES = 8;

    @Test
    public void testStrLength1(){
        final StringToInt stringToInt = new StringToInt();
        final int value = stringToInt.toInt("a");
        final int expected = 'a'<<OFFSET_3_BYTES;
        Assert.assertEquals(expected, value);
    }

    @Test
    public void testStrLength2(){
        final StringToInt stringToInt = new StringToInt();
        final int value = stringToInt.toInt("ab");
        final int expected1 = 'a'<<OFFSET_3_BYTES;
        final int expected2 = 'b'<<OFFSET_2_BYTES;
        Assert.assertEquals(expected1 | expected2, value);
    }

    @Test
    public void testStrLength3(){
        final StringToInt stringToInt = new StringToInt();
        final int value = stringToInt.toInt("abc");
        final int expected1 = 'a'<<OFFSET_3_BYTES;
        final int expected2 = 'b'<<OFFSET_2_BYTES;
        final int expected3 = 'c'<<OFFSET_1_BYTES;
        Assert.assertEquals(expected1 | expected2 | expected3, value);
    }

    @Test
    public void testStrLength4(){
        final StringToInt stringToInt = new StringToInt();
        final int value = stringToInt.toInt("abcd");
        final int expected1 = 'a'<<OFFSET_3_BYTES;
        final int expected2 = 'b'<<OFFSET_2_BYTES;
        final int expected3 = 'c'<<OFFSET_1_BYTES;
        final int expected4 = 'd';
        Assert.assertEquals(expected1 | expected2 | expected3 | expected4, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrLengthBig(){
        final StringToInt stringToInt = new StringToInt();
        stringToInt.toInt("abcde");
        Assert.fail();
    }
}
