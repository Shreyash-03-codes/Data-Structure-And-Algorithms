package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        printPattern(n);
    }

    public static void printPattern(int n){
        printPattern(n,0);
    }

    private static void printPattern(int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
            printPattern(row,column+1);
            System.out.print("*");
        }
        else{
            printPattern(row-1,0);
            System.out.println();
        }
    }
}
