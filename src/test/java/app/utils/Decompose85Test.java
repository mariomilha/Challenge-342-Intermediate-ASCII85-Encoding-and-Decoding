package app.utils;

import org.junit.Assert;
import org.junit.Test;



public class Decompose85Test {

    @Test
    public void testDecompose(){
        final Decompose85 decompose85 = new Decompose85();
        final int[] result = decompose85.decompose(1_298_230_816).toArray();
        Assert.assertEquals(24, result[0]);
        Assert.assertEquals(73, result[1]);
        Assert.assertEquals(80, result[2]);
        Assert.assertEquals(78, result[3]);
        Assert.assertEquals(61, result[4]);
    }

    @Test
    public void testCompose(){
        final Decompose85 decompose85 = new Decompose85();
        final char[] chars = {(char) 24, (char) 73, (char) 80, (char) 78, (char) 61};
        final DecomposedData decomposedData = new DecomposedData(chars);
        final int compose = decompose85.compose(decomposedData);
        Assert.assertEquals(1_298_230_816, compose);
    }

}
