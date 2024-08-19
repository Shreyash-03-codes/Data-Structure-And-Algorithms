//program to search an element in infinite array
package ArrayDataStructure;
import java.util.Scanner;
public class InfiniteArraySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter the Array Size:");
//        int size=sc.nextInt();

        int[] arr={12,13,34,45,56,67,78,89,90,111,234,667,890,8888};




//        System.out.println("Enter the Target Element to Search:");
//        int target=sc.nextInt();

        int result=search(arr,13);

        if (result == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at " + (result+1));
        }


    }
    public static int search(int[] arr,int target){
        int low=0;
        int high=1;
        while(target>arr[high]){
            int newLow=high+1;
            high=high+(high-low+1)*2;
            low=newLow;
        }
        int result=binarySearch(arr,target,low,high);
        return  result;
    }

    public static int binarySearch(int[] arr,int target,int low,int high){

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
