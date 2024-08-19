package ArrayDataStructure;

import java.util.Scanner;

public class InsertionSort2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Array Size:");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter The Array Elements:");
        for(int i=0;i<size;i++){

            a[i]=sc.nextInt();
            
        }

        System.out.println("Array Elements Before th insertion sort:");
        printArray(a);

        insertionSort(a);

        System.out.println("Array Elements after th insertion sort:");
        printArray(a);
    }

    static void printArray(int[]a){

        for(int i=0;i<a.length;i++){

            System.out.print(a[i]+" ");
        }

        System.out.println();
    }

    static void insertionSort(int[]a){

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

    static void swap(int[]a,int i,int j){

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}
