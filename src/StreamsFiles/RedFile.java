package StreamsFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RedFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("input.txt");
        byte[] bytes = Files.readAllBytes(path);  // put full content in the arr Bytes ---- return arr
        for (byte b: bytes ) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }

    }
}
