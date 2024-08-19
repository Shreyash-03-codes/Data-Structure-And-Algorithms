package ArrayDataStructure;

import java.util.Scanner;  //importing the Scanner class take user input

public class OrderAgnosticBinarySearch {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);  //creating the Scanner class object to take user input

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt(); //taking the size of array from user

        int[] arr=new int[size];  //declaring the array and initializing as dynamically

        System.out.println("Enter the Array element in Ascending or Descending Order:");
        for(int i=0;i<size;i++){  //for loop for taking the elements from user

            arr[i]=sc.nextInt();
        }

        System.out.println("Entered Array Elements:");
        for(int i=0;i<size;i++){

            System.out.print(arr[i]+" ");  //printing the array elements
        }
        System.out.println();

        System.out.println("Enter the element to Search:");
        int target=sc.nextInt();  //taking the array element to search

        int result=orderAgnosticBinarySearch(arr,target);  //calling the orderAgnosticBinarySearch() to search an element of array
        if(result!=-1){
            System.out.println(target+" is found at "+result);
        }
        else{
            System.out.println(target+" not found!!");
        }

    }

    public static int orderAgnosticBinarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (isAscending) {
                if (arr[mid] == target) {   //if middle element is equals to target
                    return mid + 1;
                } else if (arr[mid] < target) {  //if middle element is lesser the target then "start=mid+1"
                    start = mid + 1;
                } else if (arr[mid] > target) {  //if middle element is greater the target then "end=mid-1"
                    end = mid - 1;
                }
            } else {
                if (arr[mid] == target) {   //if middle element is equals to target
                    return mid + 1;
                } else if (arr[mid] > target) {  //if middle element is lesser the target then "start=mid+1"
                    start = mid + 1;
                } else if (arr[mid] < target) {  //if middle element is greater the target then "end=mid-1"
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
