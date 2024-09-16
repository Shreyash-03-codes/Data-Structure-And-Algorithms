package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortByRecursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();

        int[] nums=new int[size];

        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("The Array Elements Before The Selection Sort:");
        System.out.println(Arrays.toString(nums));

        selectionSort(nums,nums.length,0,0);

        System.out.println("The Array Elements After The Selection Sort:");
        System.out.println(Arrays.toString(nums));


    }

    static void selectionSort(int[] nums,int n,int i,int max){
        if(n==0){
            return;
        }

        if(i<n){
            if(nums[i]>nums[max]){
                selectionSort(nums,n,i+1,i);
            }
            else{
                selectionSort(nums,n,i+1,max);
            }
        }
        else{
            swap(nums,n-1,max);
            selectionSort(nums,n-1,0,0);
        }
    }

    static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
