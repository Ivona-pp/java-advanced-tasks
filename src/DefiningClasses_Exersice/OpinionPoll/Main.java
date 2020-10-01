package DefiningClasses_Exersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Person> listofPerson= new ArrayList<>();
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n ; i++) {
            String [] personData = bf.readLine().split("\\s+");
            Person person = new Person(personData[0],Integer.parseInt(personData[1]));
            listofPerson.add(person);
        }

        listofPerson
                .stream()
                .filter(p1 -> p1.getAge()>30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> {
                    System.out.printf("%s - %d%n", person.getName(), person.getAge());
                });
    }

}
