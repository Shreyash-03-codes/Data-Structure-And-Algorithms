package ArrayDataStructure;
import java.util.Scanner;
public class LargestElementArray {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in); //creating scannner class object
        System.out.println("Enter the Array Size: ");//taking the te size of array from user
        int size=sc.nextInt();
        int[] arr=new int[size]; //declaring the array and initializing in dynamically
        System.out.println("Enter The Array Elements: ");//taking the array elements
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered Array Elements Are: ");
        for(int i:arr){ //for each loop for accessing the array elements and printing the array elements
            System.out.print(i+" ");
        }

        int large=arr[0]; //assuming the largest element in array is 0th element
        for(int i=1;i<size;i++){ //simple  for loop for traversing the array
            if(large<arr[i]){ //checking the another element in array is greater than the large
                large=arr[i];  //if the element is greater the large then the large is the element
            }
        }
        System.out.println("\nThe Largest Element is "+large);
    }
}
