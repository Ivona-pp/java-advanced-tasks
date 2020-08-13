package StreamsFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExtrInegers {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("input.txt");
        Scanner sc = new Scanner(input);
        FileOutputStream out = new FileOutputStream("integers.txt");
        while (sc.hasNext()){
            if(sc.hasNextInt()){
                out.write(sc.nextInt());
            }
            sc.next();
        }
        out.flush();
    }
}
