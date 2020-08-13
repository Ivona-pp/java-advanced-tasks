package MultidimensionalArrays_Exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int [] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        int sumPrimary = 0;
        int sumSecondary = 0;

        for (int i = 0; i < matrix.length ; i++) {
            sumPrimary += matrix[i][i];
        }
        for (int i = matrix.length-1; i >=0 ; i--) {
                sumSecondary += matrix[i][matrix.length-1-i];


        }
        System.out.println(Math.abs(sumPrimary-sumSecondary));
    }
}
