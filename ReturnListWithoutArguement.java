package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnListWithoutArguement {
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

        System.out.println("The Target is Found at "+search(nums,target));
    }

    public static ArrayList<Integer> search(int[] nums,int target){
        return search(nums,target,0);
    }

    private static ArrayList<Integer> search(int[] nums,int target,int index){

        ArrayList<Integer> list=new ArrayList<>();

        if(index==nums.length){
            return list;
        }

        if(nums[index]==target){
            list.add(index+1);
        }

        ArrayList<Integer> list2=search(nums,target,index+1);

        list.addAll(list2);

        return list;
    }
}
