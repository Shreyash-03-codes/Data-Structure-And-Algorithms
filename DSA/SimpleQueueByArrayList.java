package QueueDataStructure;

import java.util.ArrayList;

class SimpleQueueArrayList{

    private int queueSize;
    private int front;
    private int rear;
    private ArrayList<String> queue;
    private int size;

    SimpleQueueArrayList(int queueSize){

        this.queueSize=queueSize;
        this.queue=new ArrayList<String>(queueSize);
        this.front=this.rear=-1;
        this.size=0;

    }

    public boolean isEmpty(){

        return this.rear==this.front;

    }

    public boolean isFull(){

        return this.rear==this.queueSize-1;

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

                this.rear++;
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

        this.front++;
        this.size--;
        return string;

    }

    public void displayQueue(){

        for(int i=this.front;i<=this.rear;i++){

            System.out.print(this.queue.get(i)+" ");

        }

        System.out.println();

    }

}

public class SimpleQueueByArrayList {
    public static void main(String[] args){

        SimpleQueueArrayList queue=new SimpleQueueArrayList(10);

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
        queue.enQueue("Shree");

        System.out.println("The Size of Queue "+queue.getSize());

        System.out.println("The DeQueued Element is "+queue.deQueue());
        System.out.println("The DeQueued Element is "+queue.deQueue());

        System.out.println("The Size of Queue "+queue.getSize());

        System.out.println("the Front of Queue is "+queue.getFront());
        System.out.println("the Rear of Queue is "+queue.getRear());

        queue.displayQueue();

    }
}
