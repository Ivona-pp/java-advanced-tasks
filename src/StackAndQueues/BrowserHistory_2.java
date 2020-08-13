package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        ArrayDeque<String> urls = new ArrayDeque<>();
        ArrayDeque<String> forwarded = new ArrayDeque<>();

        String currentURL = "";

        while (!"Home".equals(command)) {

            if ("back".equals(command)) {
                if (!urls.isEmpty()) {
                    forwarded.offer(currentURL);
                    currentURL = urls.pop();
                    System.out.println(currentURL);
                } else {
                    System.out.println("no previous URLs");
                }
            } else if ("forward".equals(command)) {
                if (!forwarded.isEmpty()) {
                    currentURL = forwarded.poll();
                    forwarded.clear();
                    System.out.println(currentURL);
                } else {
                    System.out.println("no next URLs");
                }

            } else {

                if (!currentURL.equals("")) {
                    urls.push(currentURL);
                }
                currentURL = command;

                System.out.println(currentURL);

            }
            command = sc.nextLine();
        }
    }

}

/*
forward
https//softuni.bg/
https//softuni.bg/trainings/courses
back
forward
back
forward
https//softuni.bg/trainings/2056
back
forward
forward
https//softuni.bg/trainings/courses
Home

no next URLs
https//softuni.bg/
https//softuni.bg/trainings/courses
https//softuni.bg/
https//softuni.bg/trainings/courses
https//softuni.bg/trainings/2056
https//softuni.bg/trainings/courses
https//softuni.bg/trainings/2056
no next URLs
https//softuni.bg/trainings/courses


*/