package MultidimensionalArrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MarixOfPolindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int columns = dimensions[1];

        String[][] matrix = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                StringBuilder word = new StringBuilder();
                int letterFAndL = 97 + row;
                int letterInTheMiddle = 97 + row + col;
                char ff = (char) letterFAndL;
                char m = (char) letterInTheMiddle;
                word.append(ff);
                word.append(m);
                word.append(ff);
                matrix[row][col] = word.toString();
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
