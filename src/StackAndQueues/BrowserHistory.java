package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        ArrayDeque<String> urls = new ArrayDeque<>();
        String currentURL = "";

        while (!"Home".equals(command)){

            if(!"back".equals(command)){
                if(!currentURL.equals("")){
                    urls.push(currentURL);
                }
                currentURL = command;

                System.out.println(currentURL);
            }else{
                if(!urls.isEmpty()){
                    currentURL = urls.pop();
                    System.out.println(currentURL);
                }else{
                    System.out.println("no previous URLs");
                }
            }


            command = sc.nextLine();
        }

    }
}
