package QueueDataStructure;

class CircularQueueArray {

    private int front;
    private int rear;
    private String[] queue;
    private int size;
    private int queueSize;

    CircularQueueArray(int queueSize){

        this.queueSize=queueSize;
        queue=new String[queueSize];
        this.rear=this.front=-1;
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

        if(isEmpty()){

            return "NULL";

        }

        return this.queue[this.front];

    }

    public String getRear(){

        if(isEmpty()){

            return "NULL";

        }

        return this.queue[this.rear];

    }

    public void enQueue(String string){

        if(isFull()){

            System.out.println("Queue is Full!!");
            return;

        }
        this.size++;
        if(this.rear==-1){

            this.rear=this.front=0;
            this.queue[this.rear]=string;

        }
        else{

            this.rear=(this.rear+1)%queueSize;
            this.queue[this.rear]=string;

        }

        System.out.println(string+" is EnQueued!!");
    }

    public String deQueue(){

        if(isEmpty()){

            return "NULL";

        }
        else{

            this.size--;
            String string=this.queue[this.front];
            if(this.front==this.rear){

                this.front=this.rear=-1;
                return string;

            }

            this.front=(this.front+1)%queueSize;
            return string;

        }

    }

    public void displayQueue(){

        int i=this.front;

        while(i<=this.queueSize){

            System.out.print(queue[i]+" ");

            i=(i+1)%queueSize;

            if(i==this.rear){
                System.out.println(queue[i]);
                break;

            }

        }

        System.out.println();

    }

}
public class CircularQueueByArray {
    public static void main(String[] args){

        CircularQueueArray queue=new CircularQueueArray(5);

        queue.enQueue("Altaf");
        queue.enQueue("yash");
        queue.enQueue("Shreyash");
        queue.enQueue("Abhijeet");
        queue.enQueue("Rohan");


        System.out.println("The Size of Queue is "+queue.getSize());

        System.out.println("The DeQueued Element is "+queue.deQueue());
        System.out.println("The DeQueued Element is "+queue.deQueue());

        System.out.println("The Size of Queue is "+queue.getSize());

        System.out.println("The Front Element is "+queue.getFront());
        System.out.println("The Rear Element is "+queue.getRear());

        queue.displayQueue();

        queue.enQueue("Avishkar");
        queue.enQueue("Vishnu");

        System.out.println("The Size of Queue is "+queue.getSize());

        System.out.println("The Front Element is "+queue.getFront());
        System.out.println("The Rear Element is "+queue.getRear());

        queue.displayQueue();

    }
}

