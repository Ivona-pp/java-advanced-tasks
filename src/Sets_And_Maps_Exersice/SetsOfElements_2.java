package Sets_And_Maps_Exersice;

import java.util.*;

public class SetsOfElements_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nm = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        Set<Integer> n = new LinkedHashSet<>();
        Set<Integer> m = new LinkedHashSet<>();
        Set<Integer> bouthHave = new LinkedHashSet<>();

        for (int i = 0; i < nm[0]; i++) {
            n.add(Integer.parseInt(sc.nextLine()));
        }
        for (int i = 0; i < nm[1]; i++) {
            m.add(Integer.parseInt(sc.nextLine()));
        }
        Iterator<Integer> firstIterator = n.iterator();
        for (int i = 0; i < n.size(); i++) {

            int number = firstIterator.next();
            if (m.contains(number)) {
                bouthHave.add(number);
            }
            // firstIterator.remove();
        }
        Iterator<Integer> printItertor = bouthHave.iterator();

        for (int i = 0; i < bouthHave.size(); i++) {
            int printNum = printItertor.next();
            System.out.printf("%d ", printNum);
          //  bouthHave.remove(printItertor);
        }
    }
}
