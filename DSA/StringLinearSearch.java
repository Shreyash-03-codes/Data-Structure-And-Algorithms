package Strings;
import java.util.Scanner;  //importing the Scanner class to take user input
public class StringLinearSearch {

    public static int linearSearch1(String str,char target){  //defining the linearSearch method to search character taking the string and character as parameter

        for(int i=0;i<str.length();i++){  //using for loop for traversing the whole string

            if(str.charAt(i)==target){  //checking the character is matched with string character

                return i+1;  //if matched returning index+1
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //Creating Scanner class object to take user input

        String str;  //declaring the string object to store


        System.out.println("Enter The String:");
        str=sc.nextLine();  //taking the string from user

        char target;  //declaring the target to store the character

        System.out.println("Enter the Character to Search:");
        target=sc.next().charAt(0);  //taking the character from user to search

        int pos=linearSearch1(str,target);  //calling the linearSearch method to search character giving the string and character as argument

        if(pos!=-1){
            System.out.println(target+" is found at "+pos);
        }
        else{
            System.out.println(target+" Not Found!!");
        }

    }
}
