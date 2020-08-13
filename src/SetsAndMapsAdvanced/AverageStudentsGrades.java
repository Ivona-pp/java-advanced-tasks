package SetsAndMapsAdvanced;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<Double>> listOfStudents = new TreeMap<>();

        while (n-- > 0) {
            String[] nameWithGrade = sc.nextLine().split("\\s+");
            String name = nameWithGrade[0];
            Double grade = Double.parseDouble(nameWithGrade[1]);

            listOfStudents.putIfAbsent(name, new ArrayList<Double>());
            listOfStudents.get(name).add(grade);
        }


        for (Map.Entry<String, List<Double>> entry :listOfStudents.entrySet()) {
            double averageGrade = 0;
            System.out.print(entry.getKey() + " -> ");
            for (Double grade:entry.getValue()) {
                averageGrade += grade;
                System.out.printf("%.2f ",grade);
            }
            System.out.printf("(avg: %.2f)%n", averageGrade/entry.getValue().size());
        }
    }
}
