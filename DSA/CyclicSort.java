package ArrayDataStructure;

import java.util.Scanner;
public class CyclicSort {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();


        int[] a=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("The Array Elements Before the Cyclic sort:");
        printArray(a);

        cyclicSort(a);

        System.out.println("The Array Elements after the Cyclic sort:");
        printArray(a);
    }

    static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    static  void cyclicSort(int []a){

        int i=0;

        while(i<a.length){

            int correct=a[i]-1;

            if(a[i]!=i+1){
                swap(a,i,a[i]-1);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
