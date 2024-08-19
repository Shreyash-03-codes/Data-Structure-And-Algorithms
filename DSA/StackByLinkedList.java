package StackDataStructure;

class Node {

    private String data;
    private Node next;
    private Node top;
    private Node tail;
    private int size = 0;


    public int getSize(){

        return this.size;

    }

    public boolean isEmpty(){

        return this.top==null;

    }

    public boolean isFull(){

        Node temp=new Node();

        return temp==null;

    }

    public void push(String data) {

        if (isFull()) {

            System.out.println("StackOverFlow!");

            return;
        }
        else {

            Node newNode = new Node();

            newNode.data = data;

            size++;

            if (top == null) {

                top = newNode;
                tail = newNode;

            }

            newNode.next = top;

            top = newNode;

            System.out.println(data + " is Pushed!");
        }

    }

    public String pop() {

        if(this.top==null){

            return "NULL";

        }
        else{

            this.size--;

            Node temp=top;

            top=top.next;

            return temp.data;

        }

    }

    public String peek(int ind){

        Node temp=top;

        int i=1;

        while(i<=ind){

            i++;

            temp=temp.next;

        }

        return temp.data;

    }

    public String getStackTop(){

        return this.top.data;

    }

    public String getStackBottom(){

        return this.tail.data;

    }

    public void displayStack(){

        Node temp=this.top;

        while(temp!=tail){

            System.out.print(temp.data+" ");
            temp=temp.next;

        }

        System.out.println();

    }

}


public class StackByLinkedList {
    public static void main(String[] args){

        Node stack=new Node();

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
