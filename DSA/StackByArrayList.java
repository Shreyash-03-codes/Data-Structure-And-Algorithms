package StackDataStructure;

import java.util.ArrayList;
class StackArrayList{

    private int top;
    private int size=0;
    private ArrayList<String> stack;
    private int stackSize;

    StackArrayList(int stackSize){

        this.stackSize=stackSize;
        stack=new ArrayList<String>(stackSize);
        this.top=-1;

    }

    public boolean isFull(){

        return this.top==this.stackSize-1;

    }

    public boolean isEmpty(){

        return this.top==-1;

    }

    public int getSize(){

        return this.size;

    }

    public void push(String string){

        if(isFull()){

            System.out.println("StackOverFlow!!");
            return;

        }

        this.size++;
        this.top++;
        this.stack.add(top,string);
        System.out.println(string+" is Pushed!");

    }

    public String pop(){

        if(isEmpty()){

            return "NULL";

        }

        this.size--;
        String string = this.stack.get(this.top--);
        return string;

    }

    public String getStackTop(){

        return this.stack.get(this.top);

    }

    public String getStackBottom(){

        return this.stack.getFirst();

    }

    public String peek(int pos){

        int ind=this.top-pos+1;

        if(ind<0){

            return "NULL";

        }

        return this.stack.get(ind);

    }

    public void displayStack(){

        for(int i=top;i>=0;i--){

            System.out.print(this.stack.get(i)+" ");

        }

        System.out.println();
    }

}
public class StackByArrayList {
    public static void main(String[] args){

        StackArrayList stack =new StackArrayList(10);

        stack.push("Shreyash");
        stack.push("Abhijeet");
        stack.push("Avishkar");
        stack.push("Vishnu");
        stack.push("Rohan");
        stack.push("Vivek");
        stack.push("Pratik");
        stack.push("Altaf");
        stack.push("Nitish");
        stack.push("Krishna");

        System.out.println("The size of Stack is "+stack.getSize());

        System.out.println("The Poped Element is "+stack.pop());
        System.out.println("The Poped Element is "+stack.pop());
        System.out.println("The Poped Element is "+stack.pop());
        System.out.println("The Poped Element is "+stack.pop());

        System.out.println("The size of Stack is "+stack.getSize());

        System.out.println("The TopMost Element is "+stack.getStackTop());
        System.out.println("The BottomMost Element is "+stack.getStackBottom());

        System.out.println("The Peeked element is "+stack.peek(3));

        stack.displayStack();

    }
}
