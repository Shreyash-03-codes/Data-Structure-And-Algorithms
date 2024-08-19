package ArrayDataStructure;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array:");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){

            a[i]=sc.nextInt();

        }

        System.out.println("The Array Element before the Bubble Sort:");
        printArray(a);

        bubbleSort(a);
        System.out.println("The Array Element before the Bubble Sort:");
        printArray(a);

    }

    public static void printArray(int[] a){

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]+" ");

        }

        System.out.println();

    }

    public static void bubbleSort(int []a){

        for(int i=0;i<a.length-1;i++){

            for(int j=1;j<a.length-i;j++){

                if(a[j-1]>a[j]){

                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;

                }

            }

        }

    }

}
