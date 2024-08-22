package Recursion;

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int size=sc.nextInt();

        int[] nums=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("The Array is Sorted "+isSorted(nums));
    }

    public static boolean isSorted(int[] nums){
        return isSorted(nums,0);
    }

    private static boolean isSorted(int[] nums,int index){
        if(index==nums.length-1){
            return true;
        }

        if(nums[index]>nums[index+1]){
            return false;
        }

        return isSorted(nums,index+1);
    }
}
