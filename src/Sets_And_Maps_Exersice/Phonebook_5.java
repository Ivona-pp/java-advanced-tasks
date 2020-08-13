package Sets_And_Maps_Exersice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> phonebook = new HashMap<>();
        String command = sc.nextLine();
        while (!command.equals("search")){
            String[] tockens = command.split("-");
            phonebook.put(tockens[0],tockens[1]);
            command = sc.nextLine();
        }
        command = sc.nextLine();
        while (!command.equals("stop")){
            if(phonebook.containsKey(command)){
                System.out.printf("%s -> %s%n",command,phonebook.get(command));
            }else{
                System.out.printf("Contact %s does not exist.%n",command);
            }
            command = sc.nextLine();
        }
    }
}
