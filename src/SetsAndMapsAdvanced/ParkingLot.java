package SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Handler;

public class ParkingLot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Set<String> cars = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String direction = tokens[0];
            String regNumber = tokens[1];
            if (direction.equals("IN")) {
                cars.add(regNumber);
            } else {
                cars.remove(regNumber);
            }
            input = sc.nextLine();
        }

        if (!cars.isEmpty()) {
            for (String car : cars) {
                System.out.println(car);
            }
        }else{
            System.out.println("Parking Lot is Empty");
        }
    }
}
