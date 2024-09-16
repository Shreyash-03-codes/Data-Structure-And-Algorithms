package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        printPattern(n);
    }

    public static void printPattern(int n){
        printPattern(n,n,0);
    }

    private static void printPattern(int n,int row,int column){
        if(n==0){
            return;
        }

        if(column<row){
            System.out.print("*");
            printPattern(n,row,column+1);
        }
        else{
            System.out.println();
            printPattern(n-1,row,0);
        }
    }

}
