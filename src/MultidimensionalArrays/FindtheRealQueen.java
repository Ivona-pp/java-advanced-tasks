package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindtheRealQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String[8][8];
        boolean isQueen = true;


        for (int i = 0; i < 8; i++) {
            String[] arr = sc.nextLine().split("\\s+");
            matrix[i] = arr;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == "q") {
                    int row = i;
                    int column = j;
                    for (int k = 0; k < matrix[row].length; k++) {
                        if (matrix[row][k] == "q") {
                            isQueen = false;
                            break;
                        }else{
                            for (int l = 0; l <matrix.length ; l++) {
                                if(matrix[l][column] == "q"){
                                    isQueen = false;
                                    break;
                                }else{

                                }

                            }
                        }

                    }
                }
            }
        }

    }
}
