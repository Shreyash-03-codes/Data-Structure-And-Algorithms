package ArrayListCollection;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListImplementation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//creating the Scanner class object
        System.out.println("Enter the size of ArrayList to use:");
        int size=sc.nextInt();//taking the size of arraylist from user
        ArrayList<Integer> list=new ArrayList<Integer>();//declaring the ArrayList And initializing dynamically
        System.out.println("Enter the ArrayList Elements:");
        for(int i=0;i<size;i++){ //taking the ArrayList element from user
            int num=sc.nextInt(); //storing the entered number by user in the num variable
            list.add(i,num); //adding the number at ith index which start from the 0 and ends at size-1
        }
//        System.out.println("The Entered ArrayList Elements Are:");
//        System.out.println(list); //displaying the list
//        System.out.println("Entered ArrayList Elements Are:");
//        for(int i=0;i<size;i++){   //printing the arraylist element by using the for loop
//            System.out.print(list.get(i)+" ");
//        }

        System.out.println("The Entered ArrayList Elements are:");
        for(int i:list){  //printing the arraylist element by using the for each loop
            System.out.print(i+" ");
        }

        System.out.println("\nEnter the position to remove an element:");
        int ind=sc.nextInt();
        list.remove(ind-1); //removing the ind-1 element because the  user knows the position of element but actual index start form 0 and user see from 1

        System.out.println("The ArrayList Elements after removing element:");
        for(int i:list){  //printing the arraylist element by using the for each loop
            System.out.print(i+" ");
        }
    }
}
