package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        Set<String> guests = new TreeSet<>();
        while (!command.equals("PARTY")){
            guests.add(command);
            command=sc.nextLine();
        }
        command = sc.nextLine();
        while (!command.equals("END")){
            guests.remove(command);
            command = sc.nextLine();
        }
        System.out.println(guests.size());
        for (String name:guests) {
            if(Character.isDigit(name.charAt(0))){
                System.out.println(name);
            }
        }
        for (String name:guests) {
            if(!Character.isDigit(name.charAt(0))){
                System.out.println(name);
            }
        }
    }
}
