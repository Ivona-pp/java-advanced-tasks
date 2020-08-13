package MultidimensionalArrays;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsofMtrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] sizes = Arrays.stream((sc.nextLine().split(", "))).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = matrixReader(sizes, sc);
        int sum = 0;

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }

    private static int[][] matrixReader(int[] sizes, Scanner sc) {
        int rows = sizes[0];
        int colums = sizes[1];
        System.out.println(rows);
        System.out.println(colums);
        int[][] matrix = new int[rows][colums];
        for (int i = 0; i < matrix.length ; i++) {
            int [] arr = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        return matrix;
    }
}
