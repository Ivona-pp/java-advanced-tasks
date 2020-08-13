package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondPlayer = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 50;
        while (rounds-- > 0) {
            Iterator<Integer> firstIterator = firstPlayer.iterator();
            int firstCard = firstIterator.next();
            firstIterator.remove();
            Iterator<Integer> secondIterator = firstPlayer.iterator();
            int secondCard = secondIterator.next();
            secondIterator.remove();

            if (firstCard > secondCard) {
                firstPlayer.addAll(Arrays.asList(firstCard, secondCard));
            } else if(firstCard < secondCard){
                secondPlayer.addAll(Arrays.asList(firstCard, secondCard));
            }

            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                break;
            }
        }
        String output = "Draw!";
        if (firstPlayer.size() < secondPlayer.size()) {
            output = "Second player win!";

        } else if (secondPlayer.size() < firstPlayer.size()) {
            output = "First player win!";
        }
        System.out.println(output);
    }
}

