package Recursion;

import java.util.Scanner;

public class RotatedArrayBinarySearch {
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

        System.out.println("The Target is Found At "+search(nums,target));
    }

    public static int search(int[] nums,int target){
        return search(nums,target,0, nums.length-1);
    }

    private static int search(int[] nums,int target,int start,int last){
        if(start>=last){
            return -1;
        }

        int mid=(start+last)/2;

        if(nums[mid]==target){
            return mid+1;
        }

        if(nums[start]<=nums[mid]){
            if(target>=nums[start] && target<=nums[mid]){
                return search(nums,target,start,mid-1);
            }
            else{
                return search(nums,target,mid+1,last);
            }
        }

        if(target>=nums[mid] && target<=nums[last]) {
                return search(nums, target, mid+1, last);
            }


        return search(nums,target,start,mid-1);


    }
}
