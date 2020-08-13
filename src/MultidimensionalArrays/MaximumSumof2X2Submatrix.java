package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2X2Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sizes = Arrays.stream((sc.nextLine().split(", "))).mapToInt(Integer::parseInt).toArray();
        int rows = sizes[0];
        int colums = sizes[1];
        int[][] matrix = new int[rows][colums];
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        int sum = 0;
        int[][] maxMatrix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                sum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if(sum > maxSum){
                    maxSum = sum;
                    maxMatrix[0][0] = matrix[i][j];
                    maxMatrix[0][1] = matrix[i][j+1];
                    maxMatrix[1][0] = matrix[i+1][j];
                    maxMatrix[1][1] = matrix[i+1][j+1];
                }
            }
        }
        for (int i = 0; i <maxMatrix.length ; i++) {
            System.out.print(maxMatrix[i][0] + " ");
            System.out.print(maxMatrix[i][1]);
            System.out.println();
        }
        System.out.println(maxSum);
    }

}
