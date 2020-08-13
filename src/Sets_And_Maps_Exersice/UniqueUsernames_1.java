package Sets_And_Maps_Exersice;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < n ; i++) {
            names.add(sc.nextLine());
        }

        names
                .stream()
                .forEach( k -> System.out.println(k));
    }
}
