package Sets_And_Maps_Exersice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> counterMap = new TreeMap<>();
        for (int i = 0; i <input.length() ; i++) {
            char symbol = input.charAt(i);
            counterMap.putIfAbsent(symbol, 0);
            counterMap.put(symbol,counterMap.get(symbol)+1);
        }
        for (Map.Entry<Character, Integer> entry: counterMap.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(),entry.getValue());
        }
    }
}
