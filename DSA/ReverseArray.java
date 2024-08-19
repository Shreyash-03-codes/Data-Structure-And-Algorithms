package ArrayDataStructure;
import java.util.Scanner;
public class ReverseArray {

    public static void reverse(int[] arr){ //defining the reverse function
        int i,j;
        try {
            for(i=0,j=arr.length-1;i<=j;i++,j--){ //i counter start from the 0 and j start from the last index of array while i counter is smaller than j counter we swap the i and j
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //creating the Scanner class object
        System.out.println("Enter the Array Size: ");
        int size=sc.nextInt(); //taking the array size

        int[] arr=new int[size];//declaring the array and initializing in heap


        System.out.println("Enter the Array elements: ");
        for(int i=0;i<size;i++){ //taking the array elements from user
            arr[i]=sc.nextInt();
        }

        System.out.println("The Array elements before the reversing the Array: ");
        for(int i:arr){ //printing the array elements
            System.out.print(i+" ");
        }
        System.out.println();

        reverse(arr); //calling the reverse function to reverse the array

        System.out.println("The Array elements after the reversing the Array");
        for(int i:arr){ //printing the array elements after the reversing
            System.out.print(i+" ");
        }
    }
}
