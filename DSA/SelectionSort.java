package ArrayDataStructure;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Array Size:");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter the Array elements:");
        for(int i=0;i<size;i++){

            a[i]=sc.nextInt();

        }

        System.out.println("Array Elements before the selection sort:");
        printArray(a);

        selectionSort(a);

        System.out.println("Array Elements after the selection sort:");
        printArray(a);
    }

    static void printArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }

        System.out.println();

    }

    static void selectionSort(int []a){

        for(int i=0;i<a.length;i++){

            int last=a.length-1-i;
            int start=i;

            int large=max(a,start,last);

            swap(a,large,last);

        }
    }

    static int max(int[] arr,int start,int last){

        int large=last;

        for(int i=start;i<=last;i++){

            if(arr[i]>arr[large]){

                large=i;
            }
        }
        return large;
    }

    static void swap(int [] a,int i,int j){

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
