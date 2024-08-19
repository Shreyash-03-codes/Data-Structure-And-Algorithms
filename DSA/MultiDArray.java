package DSA;
import java.util.Scanner;
import java.util.Arrays;
public class MultiDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //declaring the multi D array
        //syntax
        //data_type[][] array_name;
//        int [][] arr;

        //initializing the multi D array
        //syntax
        //data_type= new int[rows][columns];
//        int row=3;
//        int col=3;
//        arr=new int[row][col];
        //accessing the array elements by there index
//        System.out.println(arr[0][0]);//if array is empty the default value is 0
        //taking user input of multi D array
        System.out.println("enter the rows of matrix");
        int row=sc.nextInt();
        System.out.println("enter the columns of matrix");
        int col=sc.nextInt();
        int [][] matrix=new int[row][col];  //rows are must be required not the columns


        //taking the user input of matrix
        //for user input we have to ues nested for loop outer for loop for rows
        //and inner for loop for columns
        System.out.println("enter the array elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //displaying the matrix by using simple for loop
//        System.out.println("enter the array elements");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

        //displaying the matrix elements by using the for eacg loop
//        for(int a[]:matrix){
//            for(int e:a){
//                System.out.print(e+" ");
//            }
//            System.out.println();
//        }

        //displaying the matrix elements by using the toString()
        for(int a[]:matrix){
            System.out.println(Arrays.toString(a));
        }

    }
}
