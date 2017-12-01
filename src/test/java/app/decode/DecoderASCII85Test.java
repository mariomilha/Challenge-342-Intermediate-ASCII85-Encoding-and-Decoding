package app.decode;

import app.utils.Decompose85;
import app.utils.StringSplitter;
import org.junit.Assert;
import org.junit.Test;

public class DecoderASCII85Test {

    @Test
    public void test(){
        final DecoderASCII85 decoderASCII85 = new DecoderASCII85(new StringSplitter(), new Decompose85());
        final String decode = decoderASCII85.decode("6$.3W@r!2qF<G+&GA[");
        Assert.assertEquals("Attack at dawn", decode);
    }

}