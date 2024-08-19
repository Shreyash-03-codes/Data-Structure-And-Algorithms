package ArrayDataStructure;
import java.util.Scanner;
public class SwapArrayElements {
    public static void swap(int[] arr,int ind1,int ind2){//defining the swap function to swap the array elements
        try {
            int temp = arr[ind1];  //temp contains the value at arr[ind1]
            arr[ind1] = arr[ind2]; //arr[ind1] is assigned as arr[ind2] value
            arr[ind2] = temp;//and the arr[ind2] is assigned as temp value
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//creating the scanner class object
        System.out.println("Enter the Array Size:");
        int size=sc.nextInt(); //taking the size of array from user

        int[] arr=new int[size];//declaring and initializing the array aas dynamically

        System.out.println("Enter the Array elements: ");
        for(int i=0;i<size;i++){ //taking the array elements from user
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered Array elements Are: ");
        for(int i:arr){ //printing the array elements
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Enter the position of Array elements to swap the elements: ");
        int ind1=sc.nextInt(); //taking the array indexes to swap the array elements
        int ind2=sc.nextInt();

        swap(arr,ind1-1,ind2-1);//calling the swap function to swap the array elements which is created by me

        System.out.println("The Array Elements After the Swapping: ");
        for(int i:arr){ //printing the array elements after the swapping
            System.out.print(i+" ");
        }
    }
}
