package HashDataStructure;

import java.util.HashSet;
import java.util.Iterator;

public class BuiltInHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        System.out.println(set.isEmpty());
        //inserting values in hashset
        set.add(39);
        set.add(61);
        set.add(55);
        set.add(19);
        set.add(42);

        //accessing values from hashset
        if (set.contains(39)) {
            System.out.println("39 is Present");
        } else {
            System.out.println("39 is not present");
        }
        if (set.contains(61)) {
            System.out.println("61 is Present");
        } else {
            System.out.println("61 is not present");
        }
        if (set.contains(100)) {
            System.out.println("100 is Present");
        } else {
            System.out.println("100 is not present");
        }

        System.out.println("The Class of HashSet " + set.getClass());

        //using Iterator class to iterate hashset
        Iterator<Integer> value= set.iterator();

        System.out.println("The hashSet Elements Before The removing:");
        while (value.hasNext()){
            System.out.println(value.next());
        }

        //removing the element from hashset
        set.remove(42);
        value= set.iterator();
        System.out.println("The HashSet Elements After The Removing:");
        while (value.hasNext()){
            System.out.println(value.next());
        }

    }
}
