package Sets_And_Maps_Exersice;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FixEmails_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> emails = new TreeMap<>();

        String input= sc.nextLine();
        while (!input.equals("stop")){
            String email = sc.nextLine();
            String[] emailParts = email.split("\\.");
            String two = email.substring(email.length()-2);
            String three = email.substring(email.length()-3);
            if(!two.equals("us")
                    && !two.equals("uk")
                    && !three.equals("com")
            && !two.equals("US")
                    && !two.equals("UK")
                    && !three.equals("COM")){
                emails.put(input,email);
            }
            input = sc.nextLine();
        }
        emails
                .forEach((k,v)-> System.out.printf("%s -> %s%n",k, v));
    }
}
