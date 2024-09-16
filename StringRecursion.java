package Recursion;

import java.util.Scanner;

public class StringRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the Expression:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Enter the Expression to Skip:");
        String c=sc.next();

        System.out.println("The Expression before the Skipping:");
        System.out.println(str);
        System.out.println("The Expression after the Skipping:");
        //skip("",str,c);
//        System.out.println(skip(str,c));
        skipExpression("",str,c);
    }

    static void skipExpression(String p,String up,String exp){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.startsWith(exp)){
            skipExpression(p,up.substring(exp.length()),exp);
        }
        else{
            skipExpression(p+up.charAt(0),up.substring(1),exp);
        }
    }
    static void skip(String p,String up,char c){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        if(ch==c){
             skip(up.substring(1),c);
        }
        else{
             skip(p+ch,up.substring(1),c);
        }
    }


    static String skip(String up,char c){
        if(up.isEmpty()){
            return "";
        }

        char ch=up.charAt(0);

        if(ch==c){
            return skip(up.substring(1),c);
        }
        else{
            return ch+skip(up.substring(1),c);
        }
    }
}
