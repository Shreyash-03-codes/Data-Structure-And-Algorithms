//program to search Floor element of given number
package ArrayDataStructure;
import java.util.Scanner;
public class FloorElementInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered Array Elements are:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the Element to search Floor Element:");
        int target=sc.nextInt();

        int result=floor(arr,target);

        System.out.println("The Floor Element is "+arr[result]);

    }

    public static int floor(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
        }
        return high;
    }
}
