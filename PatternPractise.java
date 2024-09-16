package Patterns;

import java.util.Scanner;

public class PatternPractise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        printPattern2(n);
        System.out.println();
        printPattern1(n);

    }


    public static void printPattern1(int n){
        printPattern1(n,0);
    }

    private static void printPattern1(int row,int col){
        if(row==0){
            return;
        }



        if(col<row){

            System.out.print("*");
            printPattern1(row,col+1);

        }
        else{

            System.out.println();
            printPattern1(row-1,0);

        }
    }
    public static void printPattern2(int n){
        printPattern2(n,0);
    }

    private static void printPattern2(int row,int col){
        if(row==0){
            return;
        }

        if(col<row){
            printPattern2(row,col+1);
            System.out.print("*");

        }
        else{
            printPattern2(row-1,0);
            System.out.println();

        }
    }
}
