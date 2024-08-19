package ArrayListCollection;
import java.util.Scanner;//importing the Scanner class to take user input
import java.util.ArrayList;
public class LargestElementArrayList {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ArrayList Size:");
        int size=sc.nextInt(); //taking the ArrayList size from user
        ArrayList<Integer> list=new ArrayList<Integer>(); //declaring the ArrayList And initializing dynamically
        System.out.println("Enter the ArrayList Elements:");
        for(int i=0;i<size;i++){//using for loop for taking arraylist element from user
            int num=sc.nextInt();//storing the user entered element in num variable
            list.add(i,num); //adding the number at ith index
        }

        System.out.println("The Entered ArrayList Elements Are:");
        for(int i=0;i<size;i++){  //printing the ArrayList Elements using simple for loop
            System.out.print(list.get(i)+" ");
        }

        int large=list.get(0); //assuming the largest element is at 0th index

        for(int i=1;i<size;i++){   //traversing the whole ArrayList using the simple for loop
            if(large<list.get(i)){  //checking any other element is greater the large
                large=list.get(i); //if any other element is greater the large is that element
            }
        }

        System.out.println("\nThe Largest ELement is "+large);//printing the largest element
    }
}
