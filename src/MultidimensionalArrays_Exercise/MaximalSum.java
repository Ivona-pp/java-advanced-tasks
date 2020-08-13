package MultidimensionalArrays_Exercise;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int columns = dimensions[1];
        int [][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            int [] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        int sum =0;
        int maxSum = 0;
        int [][] maxMatrix = new int[3][3];

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length -2 ; j++) {
                sum =0;
                for (int k = 0; k < 3 ; k++) {
                    for (int l = 0; l < 3 ; l++) {
                        sum += matrix[i+k][j+l];
                    }
                }
                if(sum > maxSum){
                    maxSum = sum;
                    for (int k = 0; k < 3 ; k++) {
                        for (int l = 0; l < 3 ; l++) {
                            maxMatrix[k][l] = matrix[i+k][j+l];
                        }
                    }
                }
            }
        }
        System.out.println(String.format("Sum = %d",maxSum));
        for (int i = 0; i <maxMatrix.length ; i++) {
            for (int j = 0; j < maxMatrix.length; j++) {
                System.out.print(maxMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
