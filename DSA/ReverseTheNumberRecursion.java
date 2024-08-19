package Recursion;

import java.util.Scanner;

public class ReverseTheNumberRecursion {
    static int rev=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=sc.nextInt();

        reverse(num);

        System.out.println("The Reverse number is "+rev);
    }

    static int reverse(int num){

        if(num==0){
            return 1;
        }

        rev=rev*10+num%10;

        return reverse(num/10);
    }
}
