package ArrayDataStructure;
import java.util.Arrays;
import java.util.Scanner;  //importing the Scanner class to take user input
public class LinearSearch2DArray {

    public static int[] linearSearch1(int[][] matrix,int row,int col,int target){  //defining the linearSearch() to search an element
        for(int i=0;i<row;i++){  //for rows

            for(int j=0;j<col;j++){  //for columns

                if(matrix[i][j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static boolean linearSearch2(int[][] matrix,int target){  //defining the linearSearch() to search an element
        for(int i[]:matrix){  //for rows

            for(int j:i){  //for columns

                if(j==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);   //creating Scanner class object to take user input

        System.out.println("Enter the Rows of matrix");
        int row=sc.nextInt();  //taking the rows count from user

        System.out.println("Enter the columns of matrix:");
        int col=sc.nextInt();  //taking the columns count from user

        int[][] matrix=new int[row][col];  //declaring the matrix and initializing as dynamically

        System.out.println("Enter the matrix Elements:");
        for(int i=0;i<row;i++){  //for rows

            for(int j=0;j<col;j++){  //for columns

                matrix[i][j]=sc.nextInt();  //taking the element from user
            }
        }

        System.out.println("Entered Matrix is :");
        for(int i=0;i<row;i++){  //for rows

            for(int j=0;j<col;j++){  //for columns

                System.out.print(matrix[i][j]+" ");  //printing the matrix elements
            }
            System.out.println();
        }

        System.out.println("Enter the Element to search:");
        int target=sc.nextInt();  //taking the element to search


//        int[] result=linearSearch1(matrix,row,col,target);  //calling the linearSearch() to search element
//
//        String re= Arrays.toString(result);
//
//        System.out.println(target+" is found at "+re);

        boolean res=linearSearch2(matrix,target); //calling the linearSearch2() to search element


        if(res){
            System.out.println("Element Found!!");
        }
        else{
            System.out.println("Element not found!!");
        }

    }
}
