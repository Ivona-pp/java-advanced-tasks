package MultidimensionalArrays_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] command = sc.nextLine().split("\\(");
        int deg = Integer.parseInt(command[1].replace(")", ""));
        List<String> lines = new ArrayList<>();
        String input = sc.nextLine();
        while (!input.equals("END")) {
            lines.add(input);
            input = sc.nextLine();
        }
        int maxLenght = 0;
        for (String line : lines) {
            int lenght = line.length();
            if (lenght > maxLenght) {
                maxLenght = lenght;
            }
        }
        char[][] matrix = new char[lines.size()][maxLenght];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < maxLenght; j++) {
                if (j < lines.get(i).length()) {
                    matrix[i][j] = lines.get(i).charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        int timesForRotatin = deg / 90;
        int pos = 0;
        for (int i = 1; i <= timesForRotatin; i++) { // 0 = 90, 1 = 180, 2 = 270, 3=360
            pos += 90;
            if (pos > 360) {
                pos = 90;
            }
        }

        if (pos == 90) {
            char[][] newMatrix = new char[maxLenght][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < maxLenght; j++) {
                    newMatrix[j][i] = matrix[matrix.length - 1 - i][j];
                }
            }
            printMatrix(newMatrix);

        } else if (pos == 180) {
            char[][] newMatrix = new char[matrix.length][maxLenght];
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < maxLenght; j++) {
                    newMatrix[i][j] = matrix[matrix.length - 1 - i][maxLenght - 1 - j];
                }
            }
            printMatrix(newMatrix);

        } else if (pos == 270) {
            char[][] newMatrix = new char[maxLenght][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < maxLenght; j++) {
                    newMatrix[newMatrix.length - 1 - j][i] = matrix[i][j];
                }
            }
            printMatrix(newMatrix);

        } else if (pos == 360) {
            printMatrix(matrix);
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
}
