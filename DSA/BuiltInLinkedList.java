package LinkedListDataStructure;

import java.util.LinkedList;

public class BuiltInLinkedList {
    public static void main(String[] args){

        LinkedList<String> list=new LinkedList<>();

        list.add("Shreyash");
        list.add("Abhijeet");
        list.add("Rohan");
        list.add("Vivek");
        list.add("Avishkar");
        list.add("Vishnu");
        list.add("Nitish");

        for(int i=0;i<list.size();i++){

            System.out.print(list.get(i)+"->");

        }
        System.out.println();
        System.out.println(list.remove());
        list.addFirst("Yash");
        list.addLast("Shree");
        for(int i=0;i<list.size();i++){

            System.out.print(list.get(i)+"->");

        }
        System.out.println();
    }
}
