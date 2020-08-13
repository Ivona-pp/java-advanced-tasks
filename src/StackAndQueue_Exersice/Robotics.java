package StackAndQueue_Exersice;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] robotsAndTime = sc.nextLine().split(";");
        String[] robots = new String[robotsAndTime.length];
        int[] time = new int[robotsAndTime.length];
        int[] currentRobotsTime = new int[robotsAndTime.length];


        for (int i = 0; i < robotsAndTime.length; i++) {
            String[] parts = robotsAndTime[i].split("-");
            robots[i] = parts[0];
            time[i] = Integer.parseInt(parts[1]);
            currentRobotsTime[i] = 0;
        }

        int[] startTime = Arrays.stream(sc.nextLine().split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int timeInSeconds = startTime[0] * 3600 + startTime[1] * 60 + startTime[2];

        ArrayDeque<String> productsQueue = new ArrayDeque<>();
        String product = "";
        boolean forAddingAgain = true;

        while (!(product = sc.nextLine()).equals("End")) {
            productsQueue.offer(product);
        }
        String productPoll = "";
        while (!productsQueue.isEmpty()) {
            productPoll = productsQueue.poll();
            timeInSeconds++;
//            if (seconds >= 60) {
//                minutes++;
//                seconds = 0;
//                if (minutes >= 60) {
//                    hours++;
//                    minutes = 0;
//                }
//            }
            forAddingAgain = true;
            for (int i = 0; i < robots.length; i++) {
                if (currentRobotsTime[i] == 0) {
                    System.out.printf("%s - %s %s%n", robots[i], productPoll,Time(timeInSeconds) );
                    forAddingAgain = false;
                    currentRobotsTime[i]++;
                    break;
                } else {
                    currentRobotsTime[i]++;
                    if (currentRobotsTime[i] == time[i]) {
                        currentRobotsTime[i] = 0;
                    }
                }
            }
            if (forAddingAgain) {
                forAddingAgain = true;
                productsQueue.offer(productPoll);
            }
        }
    }

    public static String Time(int timeInSeconds) {
        int hours = timeInSeconds / 3600;
        int minutes = timeInSeconds / 60 % 60;
        int seconds = timeInSeconds % 60;

        return String.format("[%02d:%02d:%02d]",hours, minutes, seconds);

    }
}


//ROB-60
//7:59:59
//detail
//glass
//wood
//sock
//End
