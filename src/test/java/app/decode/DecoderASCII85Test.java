package app.decode;

import app.encode.StringToInt;
import app.utils.Decompose85;
import app.utils.DecomposedData;
import app.utils.StringSplitter;
import org.junit.Assert;
import org.junit.Test;

public class DecoderASCII85Test {

    @Test
    public void testComplete(){
        final DecoderASCII85 decoderASCII85 = new DecoderASCII85(new StringSplitter(), new Decompose85(), new IntToString());
        final String decode = decoderASCII85.decode("6$.3W@r!2qF<G+&GA[");
        Assert.assertEquals("Attack at dawn", decode);
    }

    @Test
    public void testComplete2(){
        final DecoderASCII85 decoderASCII85 = new DecoderASCII85(new StringSplitter(), new Decompose85(), new IntToString());

        final String encodedMsg = decoderASCII85.decode("9lFl\"+EM+3A0>E$Ci!O#F!1");
        Assert.assertEquals("Mom, send dollars!", encodedMsg);
    }

    @Test
    public void testCompleteDawn(){
        final DecoderASCII85 decoderASCII85 = new DecoderASCII85(new StringSplitter(), new Decompose85(), new IntToString());

        final String encodedMsg = decoderASCII85.decode("A79\\\"");
        Assert.assertEquals("dawn", encodedMsg);
    }

    @Test
    public void testCompleteDollars(){
        final DecoderASCII85 decoderASCII85 = new DecoderASCII85(new StringSplitter(), new Decompose85(), new IntToString());

        final String encodedMsg = decoderASCII85.decode("+CoD,Cgh@*+T");
        Assert.assertEquals(" dollars!", encodedMsg);
    }

    @Test
    public void testCompleteDaily(){
        final DecoderASCII85 decoderASCII85 = new DecoderASCII85(new StringSplitter(), new Decompose85(), new IntToString());

        final String encodedMsg = decoderASCII85.decode("06/^V@;0P'E,ol0Ea`g%AT@");
        Assert.assertEquals("/r/dailyprogrammer", encodedMsg);
    }

    @Test
    public void testComplete4(){
        final DecoderASCII85 decoderASCII85 = new DecoderASCII85(new StringSplitter(), new Decompose85(), new IntToString());

        final String encodedMsg = decoderASCII85.decode("7W3Ei+EM%2Eb-A%DIal2AThX&+F.O,EcW@3B5\\nF/hR");
        Assert.assertEquals("Four score and seven years ago ...", encodedMsg);
    }

    @Test
    public void testStuff(){
        final StringToInt stringToInt = new StringToInt();
        final String dawn = "wn";
        final int wn = stringToInt.toInt(dawn);
        final Decompose85 decompose85 = new Decompose85();
        final int[] ints = decompose85.decompose(wn)
                .toArray();
        final char[] chars = {(char)ints[0], (char)ints[1], (char)ints[2], (char)ints[3], (char)ints[4]};
        final DecomposedData decomposedData = new DecomposedData(chars);
        decomposedData.addAll(33);
        decomposedData.addAll(-33);
        final int compose = decompose85.compose(decomposedData);
        Assert.assertEquals(wn,compose);
        final IntToString intToString = new IntToString();
        final String s = intToString.toStr(compose);
        Assert.assertEquals(dawn, s);

    }

}