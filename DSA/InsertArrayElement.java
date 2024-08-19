//program to insert the element at user given index in array
package ArrayDataStructure;
import java.util.Scanner;

public class InsertArrayElement {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);   //creating the Scanner class  object to take user input

         System.out.println("Enter Total Array Size");
         int total=sc.nextInt();  //taking the Total size

         System.out.println("Enter Using Array Size");
         int use=sc.nextInt();  //taking the using size

         int[] arr=new int[total];   //declaring the Array end initializing the Array as dynamically

         System.out.println("Enter the Array elements:");
         for(int i=0;i<use;i++){  //for loop for taking the elements from user

             arr[i]=sc.nextInt();
         }

         System.out.println("array elements before the insertion:");
         printArray(arr,use);  //calling the printArray() method to print array


         System.out.println("enter the element to insert:");
        int num=sc.nextInt();//taking the number to insert

        System.out.println("enter the position to insert");
        int pos=sc.nextInt();  //taking the index to insert

         insert(arr,num,pos-1,use);

         System.out.println("array elements after the insertion:");
         printArray(arr,use+1);  //calling the printArray() method to print array


     }
     public static void printArray(int[] arr,int size){


         for (int i = 0; i < size; i++) {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }

     public static void insert(int[] arr,int num,int pos,int size){

         for(int i=size-1;i>=pos;i--){
             arr[i+1]=arr[i];
         }
         arr[pos]=num;
     }
}

