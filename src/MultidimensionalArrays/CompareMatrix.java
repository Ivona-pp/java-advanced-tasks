package MultidimensionalArrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = readArray(sc);
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrixOne = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int[] colN = readArray(sc);
            matrixOne[i] = colN;
        }

        dimensions = readArray(sc);
        rows = dimensions[0];
        cols = dimensions[1];

        int[][] matrixTwo = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int[] colN = readArray(sc);
            matrixTwo[i] = colN;
        }
        if (isEqual(matrixOne, matrixTwo)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static int[] readArray(Scanner sc) {
        return Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static boolean isEqual(int[][] matrixOne, int[][] matrixTwo) {

        boolean isEqual = true;
        if (matrixOne.length == matrixTwo.length) {
            for (int i = 0; i < matrixOne.length; i++) {
                if (matrixOne[i].length == matrixTwo[i].length) {
                    for (int j = 0; j < matrixOne[i].length; j++) {
                        if (matrixOne[i][j] != matrixTwo[i][j]) {
                            isEqual = false;
                            break;
                        }
                    }
                } else {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }
//        if (matrixOne == matrixTwo) {
//            isEqual = true;
//        }


        return isEqual;
    }
}
