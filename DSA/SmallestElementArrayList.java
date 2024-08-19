package ArrayListCollection;
import java.util.Scanner;//importing the Scanner class to take user input
import java.util.ArrayList; //importing the ArrayList To Class to use ArrayList
public class SmallestElementArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //creating the Scanner class object
        System.out.println("Enter The Size of ArrayList:");//taking the size of ArrayList from user
        int size=sc.nextInt();

        ArrayList<Integer> list=new ArrayList<Integer>();//declaring the ArrayList And initializing as dynamically

        System.out.println("Enter the ArrayList Element:");
        for(int i=0;i<size;i++){ //using the for loop for taking the elements from user
            int num=sc.nextInt(); //storing the element at num
            list.add(i,num); //adding the num at ith index
        }

        System.out.println("Entered ArrayList Elements are:");
        for(int i=0;i<size;i++){ //using the simple for loop for printing the array list elements
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        int small=list.get(0); //assuming the smallest element is at 0th index

        for(int i=1;i<size;i++){ //using the for loop for traverse whole ArrayList
            if(small>list.get(i)){ //checking any other element is smaller than small
                small=list.get(i);//if smaller than small the small is that element
            }
        }

        System.out.println("The Smallest Element is "+small);//printing the smallest element
    }
}
