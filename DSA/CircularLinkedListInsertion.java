package LinkedListDataStructure;

class CircularNode1{

    String data;
    CircularNode1 next;

    CircularNode1(String data){

        this.data=data;
        this.next=null;

    }

    public void setNext(CircularNode1 next){
        this.next=next;
    }

    public void printLinkedList(CircularNode1 head){

        CircularNode1 temp=head;

        do{

            System.out.print(temp.data+"->");
            temp=temp.next;

        }while(temp!=head);

        System.out.println("NULL");
    }

    public CircularNode1 insertAtFirst(CircularNode1 head,String data){

        CircularNode1 newNode=new CircularNode1(data);

        CircularNode1 temp=head;

        do {

            temp=temp.next;

        }while(temp.next!=head);

        temp.setNext(newNode);

        newNode.setNext(head);

        head=newNode;

        return head;
    }

    public CircularNode1 insertAtLast(CircularNode1 head,String data){

        CircularNode1 newNode=new CircularNode1(data);

        CircularNode1 temp=head;

        do {

            temp=temp.next;

        }while(temp.next!=head);

        temp.setNext(newNode);

        newNode.setNext(head);

        return head;
    }

    public CircularNode1 insertAtIndex(CircularNode1 head,String data,int index){

        CircularNode1 newNode=new CircularNode1(data);

        CircularNode1 temp1=head;
        CircularNode1 temp2=head.next;

        int i=1;

        do{

            temp1=temp1.next;
            temp2=temp2.next;
            i++;

        }while(i<index-1);

        temp1.setNext(newNode);

        newNode.setNext(temp2);

        return head;
    }
}

public class CircularLinkedListInsertion {
    public static void main(String[] args){

        CircularNode1 n1 =new CircularNode1("Shreyash");
        CircularNode1 n2 =new CircularNode1("Rohan");
        CircularNode1 n3 =new CircularNode1("Vivek");
        CircularNode1 n4 =new CircularNode1("Avishkar");
        CircularNode1 n5 =new CircularNode1("Vishnu");
        CircularNode1 n6 =new CircularNode1("Nitish");
        CircularNode1 n7 =new CircularNode1("Altaf");
        CircularNode1 n8 =new CircularNode1("Pratik");

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n8);
        n8.setNext(n1);

        System.out.println("The Linked List:");
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The InsertAtFirst:");
        n1=n1.insertAtFirst(n1,"Abhijeet");
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The InsertAtLast:");
        n1=n1.insertAtLast(n1,"Krishna");
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The InsertAtLast:");
        n1=n1.insertAtIndex(n1,"Tommy",5);
        n1.printLinkedList(n1);
    }
}
