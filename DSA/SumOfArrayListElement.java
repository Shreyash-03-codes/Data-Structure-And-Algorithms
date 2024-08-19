package ArrayListCollection;
import java.util.Scanner;  //importing the Scanner class to take user input
import java.util.ArrayList;  //importing the ArrayList Class to use it
public class SumOfArrayListElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //creating the Scanner class object

        System.out.println("Enter the Size of ArrayList:");
        int size=sc.nextInt();  //taking the Arraylist size from user

        ArrayList<Integer> list=new ArrayList<Integer>();  //declaring the ArrayList and initializing as dynamically

        System.out.println("Enter the ArrayList Element:");
        for(int i=0;i<size;i++){ //taking the elements from the user
            int num=sc.nextInt(); //storing the entered element in num
            list.add(i,num);  //adding the num at ith index of ArrayList
        }

        System.out.println("The Entered ArrayList Element Are:");
        for(int i=0;i<size;i++){ //printing the ArrayList element by using simple for loop
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        int sum=0; //declaring the sum variable for storing the sum of ArrayList Elements


        for(int i=0;i<size;i++){ //using the for loop for traverse the ArrayList element
           sum=sum+list.get(i);  //adding the element in sum and storing in it
        }

        System.out.println("The sum of ArrayList Element is "+sum);  //printing the sum of ArrayList element
    }
}
