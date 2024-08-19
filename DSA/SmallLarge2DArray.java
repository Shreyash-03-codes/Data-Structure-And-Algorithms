package ArrayDataStructure;
import java.util.Scanner; //importing Scanner Class to take user input
public class SmallLarge2DArray {

    public static int largeElement(int[][] matrix){
        int max=0;
        for(int[] i:matrix){
            for(int j:i){
                if(j>max){
                    max=j;
                }
            }
        }
        return max;
    }
    public static int smallElement(int[][] matrix){
        int min=9999;
        for(int[] i:matrix){
            for(int j:i){
                if(j<min){
                    min=j;
                }
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //creating the Scanner class object to take user input

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

        int large=largeElement(matrix);
        int small=smallElement(matrix);

        System.out.println("The Largest Element is "+large);
        System.out.println("The Smallest Element is "+small);

    }
}
