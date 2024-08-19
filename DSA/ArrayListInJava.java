package DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListInJava {
    public static void main(String[] args) {
        //declaring the ArrayList
        //syntax
        //ArrayList<data_type> list_name;
        ArrayList<Integer> list;

        //initializing the ArrayList
        //syntax
        //list_name=new ArrayList<>();
        list=new ArrayList<>();

        //Adding the elements in the Array list
        //we can add elements in arrayList by using the add() method
        list.add(55);
        list.add(23);
        list.add(54);
        list.add(90);
        list.add(78);
        list.add(12);
        list.add(42);
        list.add(53);
        list.add(64);
        list.add(76);

        //to access the arrayList element we can use get() method
        //syntax
        //list_name.get(index);
//        int num=list.get(1);
//        System.out.println(list.get(2));
//        System.out.println(num);

        //to remove the element in arrayList we can use the remove() method
        //syntax
        //list.remove(index);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        //to set Element at particular index we can use the set() method
        //syntax
        //list_name.set(index,element);
//        System.out.println(list);
//        list.set(3,666);
//        System.out.println(list);

          //to check the element is present in arrayList we can use contains() method
          //syntax
        //list_name.contains(element)
//        System.out.println(list.contains(55));

        //we can display the Array list by sout also
//        System.out.println(list);

//displaying the arrayList element by using the simple for loop
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
        //displaying the arrayList element by using the forEach loop
//        for(int a:list){
//            System.out.print(a+" ");
//        }

        //displaying the arrayList by toString()
//        Object[] a= list.toArray();
//        System.out.println(Arrays.toString(a));
    }
}
