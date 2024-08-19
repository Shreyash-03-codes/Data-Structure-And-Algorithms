//program to search peak index of array
package ArrayDataStructure;
import java.util.Scanner;
public class MountainArrayPeakIndex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the Array elements :");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered the Array elements Are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int result=peakIndex(arr);

        System.out.println(arr[result]);

    }
    public static int peakIndex(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]>arr[mid+1]){
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}
