package Recursion;

import java.util.Scanner;

public class RecursionPractise {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("The Array Elements Before the Insertion sort:");
        printArray(a);

//        bubbleSort(a);
//        selectionSort(a);
        insertionSort(a);

        System.out.println("The Array Elements after the Insertion sort:");
        printArray(a);

    }

    static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){

            for(int j=0;j<a.length-i-1;j++){

                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }

    static void selectionSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int start=0;
            int last=a.length-1-i;

            int max=maxElement(a,start,last);

            swap(a,max,last);
        }
    }

    static void insertionSort(int[] a){

        for(int i=0;i<a.length-1;i++){

            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                }
                else{
                    break;
                }
            }
        }

    }

    static int maxElement(int []a,int s,int l){
        int max=s;
        for(int i=s;i<=l;i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
