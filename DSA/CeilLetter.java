//program to search Smallest letter and greater than target or the Floor letter of target
package ArrayDataStructure;
import java.util.Scanner;
public class CeilLetter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();

        char[] arr=new char[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
        }

        System.out.println("Entered Array Elements are");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the Target to Search:");
        char target=sc.next().charAt(0);

        int result=floor(arr,target);

        System.out.println("The Floor Element is "+arr[result]);

    }

    public static int floor(char[] arr,char target){
        int low=0;
        int high=arr.length-1;
        if(arr[high]<target){
            return 0;
        }
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                low=mid+1;
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
