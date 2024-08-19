package ArrayDataStructure;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Array Size:");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){

            a[i]=sc.nextInt();

        }

        System.out.println("The Array Elements before the Insertion Sort:");
        printArray(a);

        insertionSort(a);

        System.out.println("The Array Elements after the Insertion Sort:");
        printArray(a);
    }

    static void printArray(int[] a){

        for(int i=0;i<a.length;i++){

            System.out.print(a[i]+" ");

        }

        System.out.println();

    }

    static void insertionSort(int[] a){

        for(int i=0;i<=a.length-2;i++){

            for(int j=1+i;j>0;j--){

                if(a[j]<a[j-1]){

                    swap(a,j,j-1);

                }
                else{

                    break;

                }
            }
        }
    }

    static void swap(int[]a ,int i,int j){

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
