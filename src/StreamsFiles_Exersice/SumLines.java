package StreamsFiles_Exersice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) {
        try {
            List<String> contentOfFile = Files.readAllLines(Path.of("src/Resources/input.txt"));
            for (String string : contentOfFile) {
                long asciiSum = 0;
                for (int i = 0; i < string.length() ; i++) {
                    asciiSum += string.charAt(i);
                }
                System.out.println(asciiSum);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
