package StackAndQueues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input);
        while (stack.size() > 1) {

            int first = Integer.valueOf(stack.pop());

            String op = stack.pop();

            int second = Integer.valueOf(stack.pop());

            switch (op) {

                case "+":
                    stack.push(String.valueOf(first + second));

                    break;

                case "-":
                    stack.push(String.valueOf(first - second));

                    break;
                    default:
                        break;
            }

        }

        System.out.println(stack.pop());
    }
}
