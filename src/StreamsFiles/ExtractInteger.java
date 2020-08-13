package StreamsFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");

        Scanner sc = new Scanner(file);
        PrintWriter writer = new PrintWriter("integers.csv");

        while (sc.hasNext()) {
            if(sc.hasNextInt()){
                int nextInt = sc.nextInt();
                writer.println(nextInt);
            }else{
                sc.next();
            }

        }
        writer.flush();
    }
}
