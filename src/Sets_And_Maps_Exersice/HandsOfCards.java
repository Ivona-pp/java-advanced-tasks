package Sets_And_Maps_Exersice;

import java.util.Scanner;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("JOKER")) {

            input = sc.nextLine();
        }
    }
}
