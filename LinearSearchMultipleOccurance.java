package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchMultipleOccurance {
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

    public static ArrayList<Integer> linearSearch(int[] nums,int target){
        ArrayList<Integer> list=new ArrayList<>();
        return linearSearch(nums,list,target,0);
    }

    private static ArrayList<Integer> linearSearch(int[] nums,ArrayList<Integer> list,int target,int index){
        if(index== nums.length){
            return list;
        }

        if(nums[index]==target){
            list.add(index+1);
        }

        return linearSearch(nums,list,target,index+1);
    }
}
