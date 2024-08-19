package ArrayListCollection;
import java.util.Scanner;  //importing the Scanner class to take user input
import java.util.ArrayList;  //importing the ArrayList Class to use ArrayList in program
public class ReverseArrayList {

    public static void reverse(ArrayList<Integer> list){   //defining the reverse function to reverse the ArrayList and taking the one parameter as ArrayList
        int i=0;
        int j=list.size()-1;
        while(i<j){
            swap(list,i,j);
            i++;
            j--;
        }
    }
    public static void swap(ArrayList<Integer> list,int ind1,int ind2){


        int temp=list.get(ind1);  //storing the ind1 element in temp

        list.set(ind1,list.get(ind2)); //adding the element at ind1 the element of ind1

        list.set(ind2,temp);  //adding the element at ind2  as temp

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //creating the Scanner class object to take user input

        System.out.println("Enter the Size of ArrayList:");
        int size=sc.nextInt();  //taking the size of ArrayList from user

        ArrayList<Integer> list=new ArrayList<Integer>();  //declaring the ArrayList And initializing as dynamically

        System.out.println("Enter the ArrayList Element:");
        for(int i=0;i<size;i++){  //using the for loop for taking the Arraylist element from user
            int num=sc.nextInt();  //storing the element in num form user
            list.add(i,num);  //adding the num at ith
        }

        System.out.println("The ArrayList Element Before the Reverse ArrayList:");
        for(int i=0;i<size;i++){  //using the simple for loop for printing the ArrayList Elements
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        reverse(list);  //calling the reverse function to reverse arrayList and giving the list as an argument

        System.out.println("The ArrayList Element After the Reverse ArrayList:");
        for(int i=0;i<size;i++){  //using the simple for loop for printing the ArrayList Elements
            System.out.print(list.get(i)+" ");
        }

    }
}
