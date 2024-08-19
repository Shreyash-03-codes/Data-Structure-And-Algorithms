package StackDataStructure;

class StackArray{

    private int top;
    private int sizeOfStack;
    private String[] stack;
    private int size=0;

    StackArray(int sizeOfStack){
        this.sizeOfStack=sizeOfStack;
        stack =new String[sizeOfStack];
        this.top=-1;
    }

    public boolean isFull(){
        return this.top==this.sizeOfStack-1;
    }

    public boolean isEmpty(){
        return this.top==-1;
    }

    public void displayStack(){
        for(int i=this.top;i>=0;i--){
            System.out.print(this.stack[i]+" ");
        }
        System.out.println();
    }

    public int getSize(){
        return this.size;
    }

    public void push(String string){

        if(isFull()){

            System.out.println("StackOverFlow!!");
            return;

        }

      try{
          this.size++;
          this.top++;
          this.stack[this.top]=string;
          System.out.println(string+" is Pushed!");

      }catch (Exception e){

          e.printStackTrace();

      }

    }

    public String pop(){

        if(isEmpty()){

            return "NULL";

        }

        this.size--;
        return this.stack[this.top--];

    }

    public String peek(int pos){

        int ind=this.top-pos+1;

        if(ind<0){

            return "NULL";

        }

        return this.stack[ind];
    }

    public String getStackTop(){

        return this.stack[this.top];
    }

    public String getStackBottom(){

        return this.stack[0];

    }
}
public class StackByArray {
    public static void main(String[] args){

        StackArray stack=new StackArray(10);

        stack.push("Shreyash");
        stack.push("Abhijeet");
        stack.push("Avishkar");
        stack.push("Vishnu");
        stack.push("Rohan");
        stack.push("Vivek");
        stack.push("Yash");
        stack.push("Altaf");
        stack.push("Nitish");
        stack.push("Tommy");

        System.out.println("The size of Stack is "+stack.getSize());

        System.out.println("The poped element is "+stack.pop());
        System.out.println("The poped element is "+stack.pop());
        System.out.println("The poped element is "+stack.pop());
        System.out.println("The poped element is "+stack.pop());
        System.out.println("The poped element is "+stack.pop());

        System.out.println("The size of Stack is "+stack.getSize());

        System.out.println("The TopMost Element of Stack is "+stack.getStackTop());
        System.out.println("The BottomMost Element of Stack is "+stack.getStackBottom());

        stack.displayStack();

        System.out.println("The peeked Element is "+stack.peek(3));


    }
}
