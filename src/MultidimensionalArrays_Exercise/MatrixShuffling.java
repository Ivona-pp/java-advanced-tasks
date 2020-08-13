package MultidimensionalArrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int columns = dimensions[1];
        int[][] matrix = new int[rows][columns];
        int[][] temp = new int[1][1];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        String input = sc.nextLine();
        while (!input.equals("END")) {
            String[] command = input.split("\\s+");
            if (command[0].equals("swap")) {
                if (command.length == 5) {
                    int row1 = Integer.parseInt(command[1]);
                    int col1 = Integer.parseInt(command[2]);
                    int row2 = Integer.parseInt(command[3]);
                    int col2 = Integer.parseInt(command[4]);
                    if (row1 < rows && row2 < rows) {
                        if (col1 < columns && col2 < columns) {
                            temp[0][0] = matrix[row1][col1];
                            matrix[row1][col1] = matrix[row2][col2];
                            matrix[row2][col2] = temp[0][0];
                            temp[0][0] = 0;
                             printMatrix(matrix);
                        } else {
                            System.out.println("Invalid input!");
                        }
                    } else {
                        System.out.println("Invalid input!");
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }

            input = sc.nextLine();
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
