package app.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringSplitterTest {

    @Test
    public void testSplitterSize1(){
        String value = "ola seu banana";
        final StringSplitter stringSplitter = new StringSplitter();
        final String[] splitResult = stringSplitter.split(value, 1);

        Assert.assertTrue(value.length() == splitResult.length);
        Assert.assertTrue(value.charAt(0) == splitResult[0].charAt(0));
        Assert.assertTrue(value.charAt(1) == splitResult[1].charAt(0));
        Assert.assertTrue(value.charAt(2) == splitResult[2].charAt(0));
        Assert.assertTrue(value.charAt(3) == splitResult[3].charAt(0));
        Assert.assertTrue(value.charAt(4) == splitResult[4].charAt(0));
        Assert.assertTrue(value.charAt(5) == splitResult[5].charAt(0));
        Assert.assertTrue(value.charAt(6) == splitResult[6].charAt(0));
        Assert.assertTrue(value.charAt(7) == splitResult[7].charAt(0));
        Assert.assertTrue(value.charAt(8) == splitResult[8].charAt(0));
        Assert.assertTrue(value.charAt(9) == splitResult[9].charAt(0));
        Assert.assertTrue(value.charAt(10) == splitResult[10].charAt(0));
        Assert.assertTrue(value.charAt(11) == splitResult[11].charAt(0));
        Assert.assertTrue(value.charAt(12) == splitResult[12].charAt(0));
        Assert.assertTrue(value.charAt(13) == splitResult[13].charAt(0));
    }

    @Test
    public void testSplitterSize2(){
        String value = "ola seu banana";
        final StringSplitter stringSplitter = new StringSplitter();
        final String[] splitResult = stringSplitter.split(value, 2);

        Assert.assertTrue(value.length()/2 == splitResult.length);
        Assert.assertTrue(value.charAt(0) == splitResult[0].charAt(0));
        Assert.assertTrue(value.charAt(1) == splitResult[0].charAt(1));
        Assert.assertTrue(value.charAt(2) == splitResult[1].charAt(0));
        Assert.assertTrue(value.charAt(3) == splitResult[1].charAt(1));
        Assert.assertTrue(value.charAt(4) == splitResult[2].charAt(0));
        Assert.assertTrue(value.charAt(5) == splitResult[2].charAt(1));
        Assert.assertTrue(value.charAt(6) == splitResult[3].charAt(0));
        Assert.assertTrue(value.charAt(7) == splitResult[3].charAt(1));
        Assert.assertTrue(value.charAt(8) == splitResult[4].charAt(0));
        Assert.assertTrue(value.charAt(9) == splitResult[4].charAt(1));
        Assert.assertTrue(value.charAt(10) == splitResult[5].charAt(0));
        Assert.assertTrue(value.charAt(11) == splitResult[5].charAt(1));
        Assert.assertTrue(value.charAt(12) == splitResult[6].charAt(0));
        Assert.assertTrue(value.charAt(13) == splitResult[6].charAt(1));
    }

    @Test
    public void testSplitterSize3(){
        String value = "ola seu banana";
        final StringSplitter stringSplitter = new StringSplitter();
        final String[] splitResult = stringSplitter.split(value, 3);

        Assert.assertTrue(5 == splitResult.length);
        Assert.assertTrue(value.charAt(0) == splitResult[0].charAt(0));
        Assert.assertTrue(value.charAt(1) == splitResult[0].charAt(1));
        Assert.assertTrue(value.charAt(2) == splitResult[0].charAt(2));
        Assert.assertTrue(value.charAt(3) == splitResult[1].charAt(0));
        Assert.assertTrue(value.charAt(4) == splitResult[1].charAt(1));
        Assert.assertTrue(value.charAt(5) == splitResult[1].charAt(2));
        Assert.assertTrue(value.charAt(6) == splitResult[2].charAt(0));
        Assert.assertTrue(value.charAt(7) == splitResult[2].charAt(1));
        Assert.assertTrue(value.charAt(8) == splitResult[2].charAt(2));
        Assert.assertTrue(value.charAt(9) == splitResult[3].charAt(0));
        Assert.assertTrue(value.charAt(10) == splitResult[3].charAt(1));
        Assert.assertTrue(value.charAt(11) == splitResult[3].charAt(2));
        Assert.assertTrue(value.charAt(12) == splitResult[4].charAt(0));
        Assert.assertTrue(value.charAt(13) == splitResult[4].charAt(1));
    }

    @Test
    public void testSplitterSize4(){
        String value = "ola seu banana";
        final StringSplitter stringSplitter = new StringSplitter();
        final String[] splitResult = stringSplitter.split(value, 4);

        Assert.assertTrue(4 == splitResult.length);
        Assert.assertTrue(value.charAt(0) == splitResult[0].charAt(0));
        Assert.assertTrue(value.charAt(1) == splitResult[0].charAt(1));
        Assert.assertTrue(value.charAt(2) == splitResult[0].charAt(2));
        Assert.assertTrue(value.charAt(3) == splitResult[0].charAt(3));
        Assert.assertTrue(value.charAt(4) == splitResult[1].charAt(0));
        Assert.assertTrue(value.charAt(5) == splitResult[1].charAt(1));
        Assert.assertTrue(value.charAt(6) == splitResult[1].charAt(2));
        Assert.assertTrue(value.charAt(7) == splitResult[1].charAt(3));
        Assert.assertTrue(value.charAt(8) == splitResult[2].charAt(0));
        Assert.assertTrue(value.charAt(9) == splitResult[2].charAt(1));
        Assert.assertTrue(value.charAt(10) == splitResult[2].charAt(2));
        Assert.assertTrue(value.charAt(11) == splitResult[2].charAt(3));
        Assert.assertTrue(value.charAt(12) == splitResult[3].charAt(0));
        Assert.assertTrue(value.charAt(13) == splitResult[3].charAt(1));
    }

    @Test
    public void testSplitterSizeEqual(){
        String value = "ola seu banana";
        final StringSplitter stringSplitter = new StringSplitter();
        final String[] splitResult = stringSplitter.split(value, 14);

        Assert.assertTrue(1 == splitResult.length);
        Assert.assertTrue(value.equals(splitResult[0]));
    }

    @Test
    public void testSplitterSizeGreater(){
        String value = "ola seu banana";
        final StringSplitter stringSplitter = new StringSplitter();
        final String[] splitResult = stringSplitter.split(value, 16);

        Assert.assertTrue(1 == splitResult.length);
        Assert.assertTrue(value.equals(splitResult[0]));
    }

    @Test
    public void testSplitterDot(){
        String value = ".";
        final StringSplitter stringSplitter = new StringSplitter();
        final String[] splitResult = stringSplitter.split(value, 4);

        Assert.assertTrue(1 == splitResult.length);
        Assert.assertTrue(value.equals(splitResult[0]));
    }
}
