package StackAndQueue_Exersice;

import java.util.*;
import java.util.stream.Collectors;

public class BasicStackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> NSX = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] num = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

//        ArrayDeque<Integer> numersQueue = new ArrayDeque<>();

        ArrayDeque<Integer> numsAfter = new ArrayDeque<>();

//        for (int n:num) {
//            numersQueue.push(n);
//        }
        int N = NSX.get(0);
        int S = NSX.get(1);
        int X = NSX.get(2);

        for (int i = 0; i < N ; i++) {
            numsAfter.offer(num[i]);
        }

        for (int i = 0; i < S ; i++) {
            numsAfter.poll();
        }

        if(numsAfter.contains(X)){
            System.out.println("true");
        }else if(numsAfter.isEmpty()){
            System.out.println(0);
        }
        else {
            System.out.println(Collections.min(numsAfter));
        }


    }
}
//5 2 13
//1 13 45 32 4