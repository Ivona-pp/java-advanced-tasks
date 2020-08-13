package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Maps {

    public static class Person{
        String name;
        int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Person> strings = Arrays.stream(sc.nextLine().split(","))
                .map(str -> {
                       String[] tockens =  str.split("\\s+");
                       return new Person(tockens[0], Integer.parseInt(tockens[1]));
                })
                .collect(Collectors.toMap(p -> p.name, p -> p));
    }

}
