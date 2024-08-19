package QueueDataStructure;

class Node{

    private String data;
    private Node next;
    private Node front;
    private Node rear;
    private int size=0;

    Node(){

        this.next=this.front=this.rear=null;
    }

    public boolean isEmpty(){

        return this.rear==this.front;

    }

    public boolean isFull(){

        Node temp=new Node();

        return temp==null;

    }

    public String getFront(){

        return this.front.data;

    }

    public String getRear(){

        return this.rear.data;

    }

    public int getSize(){

        return size;

    }

    public void enQueue(String string){

        if(isFull()){

            System.out.println("Queue is Full!!");
            return;

        }

        this.size++;

        Node newNode=new Node();
        newNode.data=string;

        if(this.rear==null){

            this.rear=this.front=newNode;

        }
        else {

            this.rear.next = newNode;

            this.rear = newNode;

        }

        System.out.println(string+" is EnQueued!!");

    }

    public String deQueue(){

        if(isEmpty()){

            return "NULL";
        }

        this.size--;
        String string=front.data;

            if(this.front==this.rear){

                this.front=this.rear=null;

            }
            else{

                this.front=this.front.next;

            }

        return string;
    }

    public void displayQueue(){

        Node temp=this.front;

        while(temp!=this.rear){

            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.print(rear.data+"->");
        System.out.println("NULL");

    }

}
public class QueueByLinkedList {
    public static void main(String[] args){

        Node queue=new Node();

        queue.enQueue("Shreyash");
        queue.enQueue("Avishkar");
        queue.enQueue("Abhijeet");
        queue.enQueue("Vishnu");
        queue.enQueue("Rohan");
        queue.enQueue("Pratik");
        queue.enQueue("Nitish");
        queue.enQueue("Yash");
        queue.enQueue("Vivek");

        System.out.println("The Size of Queue is  "+queue.getSize());

        System.out.println("The Dequeued Element is "+queue.deQueue());
        System.out.println("The Dequeued Element is "+queue.deQueue());

        System.out.println("The Size of Queue is  "+queue.getSize());

        System.out.println("The Rear Element is "+queue.getRear());
        System.out.println("The Front Element is "+queue.getFront());

        queue.displayQueue();

    }
}
