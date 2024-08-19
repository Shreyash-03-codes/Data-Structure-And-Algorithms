package ArrayDataStructure;
import java.util.Scanner;
public class SmallestElementArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //creating the scanner class object
        System.out.println("Enter the Array Size: ");
        int size=sc.nextInt();  //taking the size of array from user
        int[] arr=new int[size];
        System.out.println("Enter the Array elements: ");
        for(int i=0;i<size;i++){  //taking the Array elements from the user
            arr[i]=sc.nextInt();
        }

        System.out.println("The Entered Array elements: ");
        for(int i:arr){ //using the for each for printing the array elements
            System.out.print(i+" ");
        }
        System.out.println();

        int small=arr[0]; //assuming the smallest element is 0th at index

        for(int i=0;i<size;i++){ //traversing the whole array by the for loop
            if(small>arr[i]){ //checking the another element is smaller the small
                small=arr[i]; //if another element is smaller the small is that element
            }
        }

        System.out.println("The Smallest Element is "+small);
    }
}
