package QueueDataStructure;

import java.util.LinkedList;
import java.util.Queue;
public class BuiltInQueue {
    public static void main(String[] args){

        Queue<String> queue=new LinkedList<>();

        queue.add("Shreyash");
        queue.add("Abhijeet");
        queue.add("Rohan");
        queue.add("Vivek");
        queue.add("Pratik");
        queue.add("Nitish");
        queue.add("Avishkar");

        String l=queue.toString();

        System.out.println(l);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.add("Vishnu");


        System.out.println(queue.remove());
    }
}
