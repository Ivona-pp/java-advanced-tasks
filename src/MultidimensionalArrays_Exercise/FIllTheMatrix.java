package MultidimensionalArrays_Exercise;

import java.util.Scanner;

public class FIllTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tockens = sc.nextLine().split(", ");
        int dimensions = Integer.parseInt(tockens[0]);
        char pattern = tockens[1].charAt(0);
        int[][] matrix = new int[dimensions][dimensions];

        matrix = matrixAdd(dimensions, pattern);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static int[][] matrixAdd(int dimensions, char pattern) {
        int[][] matrix = new int[dimensions][dimensions];
        int count =1;

        if (pattern == 'A') {
            for (int col = 0; col < dimensions; col++) {
                for (int rows = 0; rows < dimensions; rows++) {
                    matrix[rows][col] = count;
                    count++;
                }
            }
        }
        if (pattern == 'B') {
            for (int col = 0; col < dimensions ; col++) {
                if(col % 2 == 0){
                    for (int rows = 0; rows <dimensions ; rows++) {
                        matrix[rows][col] = count;
                        count++;
                    }
                }else{
                    for (int rows = dimensions-1; rows >=0 ; rows--) {
                        matrix[rows][col] = count;
                        count++;
                    }
                }

            }

        }

        return matrix;
    }
}
