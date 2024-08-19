package ArrayDataStructure;

import java.util.Scanner;

public class PractiseArray{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("The Array Before the Sorting:");
        printArray(a);

//        bubbleSort(a);
//        insertionSort(a);
//        selectionSort(a);
        cyclicSort(a);

        System.out.println("The Array after the Sorting:");
        printArray(a);

    }

    static  void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {

            for (int j = 0; j < a.length-1-i; j++) {

                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }

            }
        }
    }

    static void insertionSort(int[] a){

        for(int i=0;i<a.length-1;i++){
            for(int j=i;j>=0;j--){
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

            int max=getMax(a,start,last);

            swap(a,max,last);
        }
    }

    static void cyclicSort(int[] a){

        int i=0;

        while(i<a.length-1){

            int correctIndex=a[i]-1;

            if(a[i]!=a[correctIndex]){
                swap(a,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    static int getMax(int[] a,int start,int last){

        int max=start;

        for (int i = start; i <=last; i++) {

            if(a[max]<a[i]){
                max=i;
            }

        }
        return max;
    }

    static  void swap(int[] a,int i,int j){

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
}