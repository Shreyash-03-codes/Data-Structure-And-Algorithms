package DSA;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysInDSA {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //syntax for array declaration
        //data_type[] array_name;
//        int[] arr;

        //syntax for array initialization
        //array_name= new data_type[size];
//        int size=5;
//        arr=new int[size];

        //to access the array elements we use the array index
        //if array is empty so array contains zero

//        System.out.println(arr[0]);

        //we can also initialize array as
//        int[] arr={12,23,34,45,67};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        //we can calculate size by using the length keyword
//        int size=arr.length;
//        System.out.println("the size of array is "+size);

        //array by user input
        //input the size of array by user
        System.out.println("enter the array size:");
        int size=sc.nextInt();
        //declaring the array and also initializing the array
        int[] arr=new int[size];
        //reading the array by user
        System.out.println("enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
//        //displaying array by using the simple for loop
//        System.out.println("entered array elements are:");
//        for(int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }


        //displaying the array by using for each loop
//        for(int a:arr){
//            System.out.print(a+" ");
//        }

        //displaying the array elements by using the toString();
        System.out.println(Arrays.toString(arr));
    }

}
