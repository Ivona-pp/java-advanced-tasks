package StackAndQueue_Exersice;

import java.util.Scanner;


public class RecursiveFiboncci {
    private static long[] memorization;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        memorization = new long [n+1];
        System.out.println(fib(n));

    }
                            //5
    private static long fib(int n) {
        if(n <=2){
            return n;
        }
        if(memorization[n] != 0){
            return memorization[n];
        }
        return  memorization[n] = fib(n-1) + fib(n-2);
                                    // 4                //3
    }
}
