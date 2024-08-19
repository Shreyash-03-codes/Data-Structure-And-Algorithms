package ArrayDataStructure;
import java.util.Scanner;  //importing the Scanner class take user input
public class EvenNumberOfDigits {

    public static int digits(int num){
        int count=0;
        while(num>0){  //calculating the digits present in number
            count++;
            num=num/10;
        }
        return count;  //returning the number of digits
    }

    public static boolean evenDigit(int num){
        int result=(digits(num));  //calling the digits function to calculate the digits of number

        return result%2==0;  //returning the result which even dis=dits of number of not
    }

    public static int numberOfDigits(int[] arr){
        int count=0;
        for(int i:arr){
            if(evenDigit(i)){   //calling the even digit function which returns number of digit is even or odd
                count++;
            }
        }
        return count;  //returning the number even digit numbers

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //creating the Scanner class object to take user input
        System.out.println("Enter the size of array:");  //taking the size of array from user
        int size=sc.nextInt();

        int[] arr=new int[size];  //declaring the array and initializing as dynamically

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){   //using the for loop for taking array elements
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered Array Elements are:");
        for(int i=0;i<size;i++){  //printing the entered array elements
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int sum=numberOfDigits(arr);  //calling the numberOfDigits function which returns hoe may even digits of number present in array

        System.out.println("The Even Digit numbers are "+sum);
    }
}
