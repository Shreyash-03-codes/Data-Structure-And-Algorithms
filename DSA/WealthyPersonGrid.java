package ArrayDataStructure;
import java.util.Scanner;  //importing the Scanner class to take user input
public class WealthyPersonGrid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //creating Scanner class object to take scanner class object

        System.out.println("Enter the Number of Persons:");  //taking the number of persons as rows
        int per=sc.nextInt();

        System.out.println("Enter the Bank Accounts of Persons:");  //taking the number of bank accounts
        int acc=sc.nextInt();

        int[][] arr=new int[per][acc];  //declaring the grid for persons and accounts

        int sum=0;
        int max=0;
        int p=0;

        System.out.println("Enter the Money of Persons Banks:");  //taking the Money of Accounts of persons
        for(int person=0;person<per;person++){  //loop for persons
            System.out.println("Enter the Money of Banks of person :"+(person+1));
            for(int account=0;account<acc;account++){  //loop for accounts
                arr[person][account]=sc.nextInt();  //storing the money in persons bank
            }
        }

        System.out.println("The Money of Persons of their Banks respective:");
        for(int person=0;person<per;person++){  //loop for persons
            System.out.println("the Money of Banks of person :"+(person+1));
            for(int account=0;account<acc;account++){  //loop for accounts
                System.out.print(arr[person][account]+" ");  //printing the money of bank of person
            }
            System.out.println();
        }

        for(int person=0;person<per;person++){  //loop for persons
            sum=0;
            for(int account=0;account<acc;account++){  //loop for accounts

                sum=sum+arr[person][account];  //storing the sum of banks money
            }

            if(sum>max){  //if sum is greater than max
                max=sum;
                p=person+1;//then maximum wealthy is sum
            }
        }

        System.out.println("The Wealthy person is "+p+" with "+max+" Money");  //printing the wealthy person ans his money

    }
}
