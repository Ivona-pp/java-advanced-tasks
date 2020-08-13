package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Double[]> list = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double[] grades = Arrays.stream(sc.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            list.putIfAbsent(name, new Double[grades.length]);
            for (int j = 0; j < grades.length; j++) {
                list.get(name)[j] = Double.valueOf(grades[j]);
            }
        }

        list
                .forEach((key, value) -> {
                    Double sum = 0.0;
                    for (int i = 0; i < value.length; i++) {
                        sum += value[i];
                    }
                    System.out.println(String.format("%s is graduated with %d", key, sum/value.length));

                });
    }
}
