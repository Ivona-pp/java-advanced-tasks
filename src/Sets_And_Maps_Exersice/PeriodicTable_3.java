package Sets_And_Maps_Exersice;

import java.util.*;

public class PeriodicTable_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Set<String> uniqueElelements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String [] input = sc.nextLine().split("\\s+");
            uniqueElelements.addAll(Arrays.asList(input));
        }
        Iterator<String> uniqueItrator = uniqueElelements.iterator();
        for (int i = 0; i < uniqueElelements.size(); i++) {
            String word = uniqueItrator.next();
            System.out.printf("%s ",word);
        }

    }
}
