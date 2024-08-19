//program to search First and Last Position of element
package ArrayDataStructure;
import java.util.Scanner;
public class FirstAndLastIndexOfElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered Array Elements Are:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter The Target:");
        int target=sc.nextInt();

        int[] result=firstAndLastIndex(arr,target);

        System.out.println(result[0]+" "+result[1]);
    }

    public static int[] firstAndLastIndex(int[] arr,int target){
        int[] re= {-1,-1};
        re[0]=search(arr,target,true);
        re[1]=search(arr,target,false);
        return re;
    }

    public static int search(int [] arr,int target,boolean firstIndex){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]<target){
                high=mid-1;
            }

            else if(arr[mid]>target){
                low=mid+1;
            }
            else {
                ans = mid;
                if (firstIndex) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return ans;
    }
}
