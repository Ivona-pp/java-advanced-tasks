package StackAndQueue_Exersice;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SImpleTextEditors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> prevCommand = new ArrayDeque<>();
        String text = "";

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] command = input.split("\\s+");
            if (command[0].equals("1")) {
//                for (int j = 0; j < command[1].length(); j++) {
//                    textStack.push(command[1].charAt(j));
//                }
                prevCommand.push(input);
                text += command[1];

            } else if (command[0].equals("2")) {
                if (!text.isEmpty()) {
                    int l = Integer.parseInt(command[1]);
                    text = text.substring(0, text.length() - l);
                    prevCommand.push(input);
                }

            } else if (command[0].equals("3")) {
                if (!text.isEmpty()) {
                    int m = (Integer.parseInt(command[1]));
                    System.out.println(text.charAt(m));
                }

            } else if (command[0].equals("4")) {
                command = prevCommand.pop().split("\\s+");
                if(command[0].equals("1")){
                    String newText = command[1];
                    text.substring(0,text.length() - command[1].length());
                }else if(command[0].equals("2")){
                    text += command[1];
                }
            }

        }
    }
}
