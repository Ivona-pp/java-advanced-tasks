package StackAndQueue_Exersice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brckets = sc.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean YES = true;

        for (int i = 0; i < brckets.length(); i++) {
            if (brckets.charAt(i)== ('(') || brckets.charAt(i) == ('[') || brckets.charAt(i) == ('{')) {
                stack.push(brckets.charAt(i));

            }else if (brckets.charAt(i)==(')')) {
                if(!stack.isEmpty()) {
                    char ch = stack.poll();
                    if (ch != ('(')) {
                        System.out.println("NO");
                        YES = false;
                        break;
                    }
                }else{
                    System.out.println("NO");
                    YES = false;
                    break;
                }

            } else if (brckets.charAt(i) == (']')){
                if(!stack.isEmpty()) {
                    char ch = stack.poll();
                    if (ch != ('[')) {
                        System.out.println("NO");
                        YES = false;
                        break;
                    }
                }else{
                    System.out.println("NO");
                    YES = false;
                    break;
                }
            } else if (brckets.charAt(i) == ('}')){
                if(!stack.isEmpty()) {
                    char ch = stack.poll();
                    if (ch != ('{')) {
                        System.out.println("NO");
                        YES = false;
                        break;
                    }
                }else{
                    System.out.println("NO");
                    YES = false;
                    break;
                }
            }else {
                System.out.println("NO");
                YES = false;
            }
        }
        if(YES){
            System.out.println("YES");
        }


    }
}
