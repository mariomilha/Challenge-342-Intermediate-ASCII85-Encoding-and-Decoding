package app.encode;

import app.utils.Decompose85;
import app.utils.StringSplitter;
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

    @Test
    public void testComplete(){
        final EncodeToASCII85 encodeToASCII85 =
                new EncodeToASCII85(new StringSplitter(), new StringToInt(), new Decompose85());

        final String encodedMsg = encodeToASCII85.encode("Attack at dawn");
        Assert.assertEquals("6$.3W@r!2qF<G+&GA[", encodedMsg);
    }

    @Test
    public void testComplete2(){
        final EncodeToASCII85 encodeToASCII85 =
                new EncodeToASCII85(new StringSplitter(), new StringToInt(), new Decompose85());

        final String encodedMsg = encodeToASCII85.encode("Mom, send dollars!");
        Assert.assertEquals("9lFl\"+EM+3A0>E$Ci!O#F!1", encodedMsg);
    }

    @Test
    public void testCompleteDawn(){
        final EncodeToASCII85 encodeToASCII85 =
                new EncodeToASCII85(new StringSplitter(), new StringToInt(), new Decompose85());

        final String encodedMsg = encodeToASCII85.encode("dawn");
        Assert.assertEquals("A79\\\"", encodedMsg);
    }

    @Test
    public void testDot(){
        final EncodeToASCII85 encodeToASCII85 =
                new EncodeToASCII85(new StringSplitter(), new StringToInt(), new Decompose85());

        final String encodedMsg = encodeToASCII85.encode(".");
        Assert.assertEquals("/c", encodedMsg);
    }


}
