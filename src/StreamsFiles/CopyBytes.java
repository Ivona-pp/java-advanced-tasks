package StreamsFiles;

import java.io.*;
import java.nio.file.Files;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("input2.txt");
        //byte[] bytes =  Files.readAllBytes(file.toPath());
        Writer writer = new FileWriter("textToBytess.txt");

        try (InputStream in = new FileInputStream(file)) {
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                String out = String.valueOf(oneByte);
                if (oneByte == 32) {
                    out = " ";
                } else if (oneByte == 10) {
                    out = System.lineSeparator();
                }
                writer.write(out);
            }
        }
/*        for (byte b:bytes  ) {
            String out = String.valueOf(b);
            if(b == 32){
                out = " ";
            }else  if (b == 10){
                out = System.lineSeparator();
            }*/
        //         writer.write(out);
    }
}
//}
