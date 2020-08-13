package StreamsFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyBytes_2 {
    public static void main(String[] args ) throws IOException {
        File text = new File("input.txt");
        byte [] bytes = Files.readAllBytes(text.toPath()); // return an array

    }
}
