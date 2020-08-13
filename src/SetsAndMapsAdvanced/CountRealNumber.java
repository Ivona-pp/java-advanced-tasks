package SetsAndMapsAdvanced;

import javax.sound.midi.Soundbank;
import java.util.*;

public class CountRealNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> map = new LinkedHashMap<>();
        for (Double num : numbers) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }else{
                map.putIfAbsent(num, 1);
            }
        }

        map.entrySet().forEach(e -> System.out.printf("%.1f -> %d%n", e.getKey(), e.getValue()));
    }
}
