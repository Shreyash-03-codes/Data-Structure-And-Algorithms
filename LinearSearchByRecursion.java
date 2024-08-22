package Recursion;

import java.util.Scanner;

public class LinearSearchByRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int size=sc.nextInt();

        int[] nums=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Enter the Target Element:");
        int target=sc.nextInt();

        System.out.println("Target is Found at "+linearSearch(nums,target));
    }

    public static int linearSearch(int[] nums,int target){
//        return linearSearchFirst(nums,target,0);
        return linearSearchLast(nums,target,nums.length-1);
    }

    private static int linearSearchFirst(int[] nums,int target,int index){
        if(index==nums.length){
            return -1;
        }

        if(nums[index]==target){
            return index+1;
        }
        return linearSearchFirst(nums,target,index+1);
    }
    private static int linearSearchLast(int[] nums,int target,int index){
        if(index==-1){
            return -1;
        }

        if(nums[index]==target){
            return index+1;
        }
        return linearSearchLast(nums,target,index-1);
    }
}
