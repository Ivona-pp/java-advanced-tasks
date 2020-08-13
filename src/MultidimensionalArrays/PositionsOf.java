package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s")).
                mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int colums = dimensions[1];

        String[][] matrix = new String[rows][colums];

        for (int i = 0; i < rows ; i++) {
            String [] arr = sc.nextLine().split("\\s+");
            matrix[i] = arr;
        }
        String n = sc.nextLine();
        int count = 0;

        for (int i = 0; i < matrix.length ; i++) {
            String [] arr = matrix[i];
            for (int j = 0; j < arr.length ; j++) {
                if(arr[j].equals(n)){
                    System.out.printf("%d %d%n",i,j);
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("not found");
        }
    }


}
