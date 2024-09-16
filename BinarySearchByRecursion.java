package Recursion;


public class BinarySearchByRecursion {
    public static void main(String[] args){

        int[] a= {12,23,34,45,56};

        int re=binarySearch(a,23,0,a.length-1);

        System.out.println(" is Found at "+re);

    }

    static int binarySearch(int[] a,int target,int start,int end) {


        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (a[mid] == target) {

            return mid + 1;

        }
        if (a[mid] < target) {

            return binarySearch(a, target, mid + 1, end);

        }

            return binarySearch(a, target, start, mid - 1);

    }
}
