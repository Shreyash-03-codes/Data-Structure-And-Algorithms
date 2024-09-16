package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByRecursion {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();

        int[] nums=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("The Array Elements Before the Bubble Sort:");
        System.out.println(Arrays.toString(nums));

        bubbleSort(nums,nums.length-1,0);

        System.out.println("The Array Elements After The Bubble Sort:");
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums,int n,int i){
        if(n==0){
            return;
        }

        if(i<n){
            if(nums[i]>nums[i+1]){
                swap(nums,i,i+1);
            }
            bubbleSort(nums,n,i+1);
        }
        else{
            bubbleSort(nums,n-1,0);
        }
    }

    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
