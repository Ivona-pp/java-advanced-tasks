package StackAndQueue_Exersice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> numToStack = new ArrayDeque<>();
        for (Integer number : nums) {
            numToStack.push(number);
        }
        for (Integer num : numToStack) {
            System.out.print(numToStack.pop()+ " ");
        }
    }
}
