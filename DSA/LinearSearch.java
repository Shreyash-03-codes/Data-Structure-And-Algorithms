package ArrayDataStructure;
import java.util.Scanner;  //importing the Scanner class to take user input
public class LinearSearch {

    public static int linearSearch1(int[] arr,int target){  //function returning the  position
        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }

    public static int linearSearch2(int[] arr,int target){  //function returning the element
        for(int i:arr){

            if(i==target){
                return i;
            }
        }
        return -1;
    }

    public static boolean linearSearch3(int[] arr,int target){  //function returning true or false
        for(int i:arr){

            if(i==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);  //creating the Scanner class object to take user input

        System.out.println("Enter the size of Array:");
        int size=sc.nextInt();  //taking the size from user

        int[] arr=new int[size];  //declaring array and initializing as dynamically

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();  //taking the Array from user
        }


        System.out.println("Entered Array Elements Are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");  //printing the array elements
        }
        System.out.println();

        System.out.println("Enter The Array Element to Search in Array:");
        int target=sc.nextInt();   //taking number from user to search

//        int resultPos=linearSearch1(arr,target);  //calling the linearSearch() to search the Element
//
//        if(resultPos!=-1){   //if position is not -1
//            System.out.println(target+" is found at "+resultPos);  //printing the position
//        }
//        else{
//            System.out.println(target+" not found ");  //printing the mot found
//        }



//        int resultNum=linearSearch2(arr,target);  //taking the Element found
//
//        if(resultNum!=-1){
//            System.out.println(resultNum+" is found !");  //printing the found element
//        }
//        else{
//            System.out.println(resultNum+" Not Found!");  //printing the not found element
//        }
        boolean result=linearSearch3(arr,target);  //taking boolean value

        if(result){
            System.out.println("Number Found!!"); //if result is true
        }
        else{
            System.out.println("Number Not Found!!"); //if result is false
        }
    }
}
