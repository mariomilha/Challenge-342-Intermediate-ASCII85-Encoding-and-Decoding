package app;

import app.decode.DecoderASCII85;
import app.decode.IntToString;
import app.encode.EncodeToASCII85;
import app.encode.StringToInt;
import app.utils.Decompose85;
import app.utils.StringSplitter;

public class App {

    public static void main(String[] args){
        if(args.length!=2){
            throw new IllegalArgumentException("Invalid arguments! correct usage: App e \"<string to encode>\"");
        }
        final String requestedString = args[1];
        final char c = args[0].charAt(0);
        switch (c){
            case 'e':
                final EncodeToASCII85 encodeToASCII85 = new EncodeToASCII85(new StringSplitter(), new StringToInt(), new Decompose85());
                final String encode = encodeToASCII85.encode(requestedString);
                System.out.println(encode);
                return;
            case 'd':
                final DecoderASCII85 decoderASCII85 = new DecoderASCII85(new StringSplitter(), new Decompose85(), new IntToString());
                final String decode = decoderASCII85.decode(requestedString);
                System.out.println(decode);
                return;
            default:
                throw new IllegalArgumentException("Invalid operation! Possible operations: e, d.");
        }
    }
}
