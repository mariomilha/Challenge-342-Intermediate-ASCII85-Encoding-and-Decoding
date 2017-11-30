package app;

import org.junit.Assert;
import org.junit.Test;



public class EncodeToASCII85Test {

    @Test
    public void testMan(){
        final EncodeToASCII85 encodeToASCII85 =
                new EncodeToASCII85(new StringSplitter(), new StringToInt(), new Decompose85());

        final String encodedMsg = encodeToASCII85.encode("Man ");
        Assert.assertEquals("9jqo^", encodedMsg);
    }

    @Test
    public void testSure(){
        final EncodeToASCII85 encodeToASCII85 =
                new EncodeToASCII85(new StringSplitter(), new StringToInt(), new Decompose85());

        final String encodedMsg = encodeToASCII85.encode("sure");
        Assert.assertEquals("F*2M7", encodedMsg);
    }


}
