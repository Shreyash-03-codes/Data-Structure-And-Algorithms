package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number for Fibonacci Number:");
        int n=sc.nextInt();

        System.out.println("The FiboNacci Number Of "+n+" is "+fibo(n));
    }

    public static int fibo(int n){

        if(n==0){

            return 0;

        }
        if(n==1){

            return 1;

        }

        return fibo(n-1)+fibo(n-2);

    }
}
