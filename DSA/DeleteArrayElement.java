//program to delete the element at user given position
package ArrayDataStructure;
import java.util.Scanner;
public class DeleteArrayElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);   //creating the Scanner class  object to take user input

        System.out.println("Enter Array Size");
        int size=sc.nextInt();  //taking the using size

        int[] arr=new int[size];   //declaring the Array end initializing the Array as dynamically

        System.out.println("Enter the Array elements:");
        for(int i=0;i<size;i++){  //for loop for taking the elements from user

            arr[i]=sc.nextInt();
        }

        System.out.println("enter the position to delete");
        int pos=sc.nextInt();  //taking the index to delete


        System.out.println("array elements before the deletion:");
        printArray(arr,size);  //calling the printArray() method to print array

        delete(arr,size,pos-1);

        System.out.println("array elements before the deletion:");
        printArray(arr,size-1);  //calling the printArray() method to print array


    }

    public static void printArray(int[] arr,int size){


        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void delete(int[] arr,int size,int ind){

        for (int i = ind; i <size-1 ; i++) {
            arr[i]=arr[i+1];
        }

    }
}
