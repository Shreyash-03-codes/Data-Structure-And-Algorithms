package StackDataStructure;

import java.util.Stack;
import java.util.function.Consumer;

public class BuiltInStack {
    public static void main(String[] args){

        Stack<String> stack=new Stack<>();

        stack.push("Shreyash");
        stack.push("Abhijeet");
        stack.push("Pratik");
        stack.push("Rohan");
        stack.push("Avishkar");
        stack.push("Vishnu");
        stack.push("Altaf");
        stack.push("Nitish");
        stack.push("Yash");

        System.out.println("The Poped element is "+stack.pop());
        System.out.println("The Poped element is "+stack.pop());
        System.out.println("The Poped element is "+stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }
}
