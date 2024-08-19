package ArrayDataStructure;
import java.util.Arrays;
import java.util.Scanner;
public class PlusOne {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[] a=new int[10];

        System.out.println("Enter the Array Size:");
        int size=sc.nextInt();

        System.out.println("Enter the Array Elements:");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }


        for(int i=a.length-1;i>=0;i--){
            if(a[i]<9){
                a[i]++;
                System.out.println(Arrays.toString(a));
            }else {
                a[i] = 0;
                int[] newDigits=new int[a.length+1];
                newDigits[0]=1;
                System.out.println(Arrays.toString(newDigits));
                break;
            }
        }

    }
}
