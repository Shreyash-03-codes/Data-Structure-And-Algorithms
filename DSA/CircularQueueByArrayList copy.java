package QueueDataStructure;

import java.util.ArrayList;

class CircularQueueArrayList{

    private int queueSize;
    private int front;
    private int rear;
    private ArrayList<String> queue;
    private int size;

    CircularQueueArrayList(int queueSize){

        this.queueSize=queueSize;
        this.queue=new ArrayList<String>(queueSize);
        this.front=this.rear=-1;
        this.size=0;

    }

    public boolean isEmpty(){

        return this.rear==this.front;

    }

    public boolean isFull(){

        return (this.rear+1)%queueSize==this.front;

    }

    public int getSize(){

        return this.size;

    }

    public String getFront(){

        return this.queue.get(this.front);

    }

    public String getRear(){

        return this.queue.get(this.rear);

    }

    public void enQueue(String string){

        if(isFull()){

            System.out.println("Queue is Full!!");
            return;

        }
        else{

            if(this.rear==-1){

                this.rear=this.front=0;
                this.queue.add(this.rear,string);

            }
            else{

                this.rear=(this.rear+1)%queueSize;
                this.queue.add(this.rear,string);
            }

        }
        this.size++;
        System.out.println(string+" is EnQueued!");

    }

    public String deQueue(){

        if(isEmpty()){

            return "NULL";

        }
        String string=this.queue.get(this.front);
        if(this.front==this.rear){

            this.front=this.rear=-1;

        }

        this.front=(this.front+1)%queueSize;
        this.size--;
        return string;

    }

    public void displayQueue(){

       int i=this.front;

       while(i<=queueSize){

           System.out.print(this.queue.get(i)+" ");

           if(i==this.rear){

               break;
           }

           i=(i+1)%queueSize;

       }

        System.out.println();

    }

}
public class CircularQueueByArrayList {
    public static void main(String[] args){

        CircularQueueArrayList queue=new CircularQueueArrayList(10);

        queue.enQueue("Altaf");
        queue.enQueue("Nitish");
        queue.enQueue("Rohan");
        queue.enQueue("Shreyash");
        queue.enQueue("yash");
        queue.enQueue("Vivek");
        queue.enQueue("Abhijeet");
        queue.enQueue("Avishkar");
        queue.enQueue("Vishnu");
        queue.enQueue("Pratik");


        System.out.println("The Size of Queue "+queue.getSize());

        System.out.println("The DeQueued Element is "+queue.deQueue());
        System.out.println("The DeQueued Element is "+queue.deQueue());

        queue.enQueue("Shree");
        queue.enQueue("Tommy");

        System.out.println("The Size of Queue "+queue.getSize());

        System.out.println("the Front of Queue is "+queue.getFront());
        System.out.println("the Rear of Queue is "+queue.getRear());

        queue.displayQueue();

    }
}
