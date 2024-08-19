package QueueDataStructure;

class QueueArray{

    private int front;
    private int rear;
    private String[] queue;
    private int size;
    private int queueSize;

    QueueArray(int queueSize){

        this.queueSize=queueSize;
        queue=new String[queueSize];
        this.rear=this.front=-1;
        this.size=0;

    }

    public boolean isEmpty(){

        return this.rear==-1;

    }

    public boolean isFull(){

        return this.rear==this.queueSize-1;

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

    public String peek(int pos){

        int ind=this.rear-pos+1;

        return this.queue[ind];

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

            ++this.rear;
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

            this.front++;
            return string;

        }

    }

    public void displayQueue(){

        for(int i=front;i<=rear;i++){

            System.out.print(queue[i]+" ");
        }

        System.out.println();

    }

}
public class SimpleQueueByArray {
    public static void main(String[] args){

        QueueArray queue=new QueueArray(10);

        queue.enQueue("Altaf");
        queue.enQueue("yash");
        queue.enQueue("Shreyash");
        queue.enQueue("Abhijeet");
        queue.enQueue("Rohan");
        queue.enQueue("Avishkar");
        queue.enQueue("Vishnu");
        queue.enQueue("Pratik");
        queue.enQueue("Vivek");
        queue.enQueue("Nitish");

        System.out.println("The Size of Queue is "+queue.getSize());

        System.out.println("The DeQueued Element is "+queue.deQueue());
        System.out.println("The DeQueued Element is "+queue.deQueue());

        System.out.println("The Size of Queue is "+queue.getSize());

        System.out.println("The Front Element is "+queue.getFront());
        System.out.println("The Rear Element is "+queue.getRear());

        System.out.println("The peeked element is "+queue.peek(3));

        queue.displayQueue();
    }
}
