package StreamsFiles;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");

        FileInputStream inputStream = new FileInputStream(file);
        Scanner sc = new Scanner(inputStream);

        StringBuilder builder = new StringBuilder();
        String line = sc.nextLine();

        while (line != null ){
            builder.append(line.replaceAll("[,\\.!\\?]",""))
            .append(System.lineSeparator());
            try {
                line = sc.nextLine();
            }catch (NoSuchElementException ex){
                inputStream.close();
                break;
            }
        }
        String string = builder.toString();
        OutputStream outputStream = new FileOutputStream("output.txt");
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.print(string);
        printWriter.flush();

    }
}
