package ArrayDataStructure;
import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //creating the Scannner class object
        System.out.println("Enter the Array size: ");
        int size=sc.nextInt(); //taking the Array size from the user

        int[] arr=new int[size]; //declaring the array and initializing the dynamically
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<size;i++){ //taking Array element from user
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered Array Elements are: ");
        for(int i:arr){ //using the for each for printing the array elements
            System.out.println(i);
        }

        int sum=0; //declaring the swum variable for storing the sum of array elements

        for(int i:arr){ //using the for each for direct accessing the elements
            sum=sum+i; //storing the sum and calculating the sum
        }

        System.out.println("The sum of Array Elements "+sum);//printing the sum of array elements
    }
}
