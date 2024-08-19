//program to search the ceil element in array of given number
package ArrayDataStructure;
import java.util.Scanner;
public class CeilElementInArray {
    public static void main(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered Array Elements:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the Number to Search the Ceil Number:");
        int target=sc.nextInt();

        int result=ceil(arr,target);

        System.out.println("The Ceil Element is "+arr[result]);
    }

    public static int ceil(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        if(arr[high]<target){
            return -1;
        }
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
        return low;
    }
}
