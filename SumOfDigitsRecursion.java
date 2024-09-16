package Recursion;

import java.util.Scanner;

public class SumOfDigitsRecursion {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number :");
        int num=sc.nextInt();

        int result=sumOfDigits(num);

        System.out.println("The Sum of Digits is "+result);

    }

    static int sumOfDigits(int num){

        if(num==0){
            return 0;
        }

        return num%10+sumOfDigits(num/10);
    }
}
