package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.SortedMap;

public class PrintQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String fileName = sc.nextLine();

        while (!"print".equals(fileName)) {
            if(!"cancel".equals(fileName)) {
                queue.offer(fileName);
            }else{
                if(!queue.isEmpty()){
                    System.out.println("Canceled " + queue.poll());
                }else{
                    System.out.println("Printer is on standby");
                }
            }

            fileName = sc.nextLine();
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
