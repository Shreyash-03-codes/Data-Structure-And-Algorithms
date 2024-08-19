package ArrayListCollection;
import java.util.Scanner; //importing the Scanner class to take user input
import java.util.ArrayList; //importing the ArrayList class To use it
public class SwapArrayListElement {

    public static void swap(ArrayList<Integer> list,int ind1,int ind2){


        int temp=list.get(ind1);  //storing the ind1 element in temp

        list.set(ind1,list.get(ind2)); //adding the element at ind1 the element of ind1

        list.set(ind2,temp);  //adding the element at ind2  as temp

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //creating the Scanner class object

        System.out.println("Enter The ArrayList Size:");
        int size=sc.nextInt(); //taking The Size of ArrayList From user

        ArrayList<Integer> list =new ArrayList<Integer>();  //declaring and initializing the ArrayList as dynamically

        System.out.println("Enter the Elements of ArrayList:");
        for(int i=0;i<size;i++){ //using simple for loop for taking the arraylist elements from user
            int num=sc.nextInt(); //storing the entered arraylist element in num
            list.add(i,num); //adding the element in list
        }

        System.out.println("Entered ArrayList Elements Are:");
        for(int i=0;i<size;i++){  //using the simple for loop for printing the arraylist elements
            System.out.print(list.get(i)+" ");  //accessing the arraylist element by using the get() method
        }
        System.out.println();
        System.out.println("enter the positions of elements of ArrayList to swap:");
        int pos1=sc.nextInt();  //taking the position for the swapping
        int pos2=sc.nextInt();

        swap(list,pos1-1,pos2-1);  //calling the swap function and giving the arguments are list ,pos1 and pos2

        System.out.println("ArrayList Elements After the swapping:");
        for(int i=0;i<size;i++){  //using the simple for loop for printing the arraylist elements
            System.out.print(list.get(i)+" ");  //accessing the arraylist element by using the get() method
        }
    }
}
