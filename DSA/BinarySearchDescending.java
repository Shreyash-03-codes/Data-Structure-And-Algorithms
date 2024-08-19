//implementing the binary search for Descending order Array

package ArrayDataStructure;

import java.util.Scanner; //importing the Scanner class to take user input

public class BinarySearchDescending {


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);  //creating the Scanner class object

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();  //taking the size of array

        int[] arr=new int[size];  //declaring the array and initializing as dynamically

        System.out.println("Enter the Array Elements in Descending order:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();   //taking the elements from user
        }

        System.out.println("Entered Array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");  //printing the array elements
        }
        System.out.println();

        System.out.println("Enter the Array element to search:");
        int target=sc.nextInt();  //taking the element to search

        int result=binarySearch(arr,target);  //calling the binarySearch() method to search an element

        if(result!=-1){
            System.out.println(target+" is found at "+result);
        }
        else{
            System.out.println(target+" not found!!");
        }
    }
    public static int binarySearch(int[] arr,int target){
        int start=0; //declaring the array start
        int end=arr.length;  //declaring the array end

        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;  //calculating the mid

            if(arr[mid]==target){   //if middle element is equals to target
                return mid+1;
            }


            else if(arr[mid]>target){  //if middle element is lesser the target then "start=mid+1"
                start=mid+1;
            }

            else if(arr[mid]<target){  //if middle element is greater the target then "end=mid-1"
                end=mid-1;
            }
        }
        return -1;
    }

}
