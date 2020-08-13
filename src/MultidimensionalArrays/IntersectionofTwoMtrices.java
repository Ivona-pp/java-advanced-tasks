package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionofTwoMtrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int colums = Integer.parseInt(sc.nextLine());
        String [][] matrixOne = new String[rows][colums];
        String [][] matrixTwo = new String[rows][colums];

        matrixOne = fillMatrix(matrixOne,rows, colums,sc);
        matrixTwo = fillMatrix(matrixTwo,rows, colums,sc);

        compareMatrixs(matrixOne,matrixTwo);
    }

    private static void compareMatrixs(String[][] matrixOne, String[][] matrixTwo) {
        for (int i = 0; i < matrixOne.length ; i++) {
            for (int j = 0; j < matrixOne[i].length ; j++) {
                if(matrixOne[i][j].equals(matrixTwo[i][j])){
                    System.out.printf("%s ",matrixOne[i][j]);
                }else{
                    if( j == matrixOne[i].length-1){
                        System.out.printf("*");
                    }else {
                        System.out.printf("* ");
                    }
                }
            }
            System.out.println();
        }

    }

    private static String[][] fillMatrix(String[][] matrix, int rows, int colums, Scanner sc) {
        for (int i = 0; i < rows ; i++) {
            String [] arr = sc.nextLine().split("\\s+");
            matrix[i] = arr;
        }
        return matrix;
    }


}
