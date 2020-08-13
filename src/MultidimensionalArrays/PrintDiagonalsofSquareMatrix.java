package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        int diagonalMatrix[][] = new int[2][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            diagonalMatrix[0][i] = matrix[i][i];
        }

        for (int i = matrix.length-1; i >= 0; i--) {
            diagonalMatrix[1][matrix.length-1-i] = matrix[i][matrix.length-1-i];
        }

        for (int i = 0; i < diagonalMatrix.length ; i++) {
            for (int j = 0; j <diagonalMatrix[i].length ; j++) {
                System.out.print(diagonalMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
