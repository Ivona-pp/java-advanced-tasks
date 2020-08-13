package StackAndQueue_Exersice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N ; i++) {
            int [] command = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if(command[0] == 1){
                stack.push(command[1]);
            }else if(command[0] == 2){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                System.out.println(Collections.max(stack));
            }
        }

    }
}
