package LinkedListDataStructure;

class CircularNode2{

    String data;
    CircularNode2 next;

    CircularNode2(String data){

        this.data=data;
        this.next=null;

    }

    public void setNext(CircularNode2 next){

        this.next=next;

    }

    public void printLinkedList(CircularNode2 head){

        CircularNode2 temp=head;

        do{

            System.out.print(temp.data+"->");
            temp=temp.next;

        }while(temp!=head);

        System.out.println("NULL");
    }

    public CircularNode2 deleteAtFirst(CircularNode2 head){

        CircularNode2 temp=head;

        do{

            temp=temp.next;

        }while(temp.next!=head);

        head=head.next;
        temp.next=head;

        return head;
    }

    public CircularNode2 deleteAtLast(CircularNode2 head){

        CircularNode2 temp1=head;
        CircularNode2 temp2=head.next;

        do{

            temp1=temp1.next;
            temp2=temp2.next;

        }while(temp2.next!=head);

        temp1.next=temp2.next;

        return head;
    }

    public CircularNode2 deleteAtIndex(CircularNode2 head,int index){

        CircularNode2 temp1=head;
        CircularNode2 temp2=head.next;

        int i=1;

        do{
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }while(i<index);

        temp1.next=temp2.next;

        return head;
    }

}
public class CircularLinkedListDeletion {
    public static void main(String[] args){

        CircularNode2 n1=new CircularNode2("Altaf");
        CircularNode2 n2=new CircularNode2("Shreyash");
        CircularNode2 n3=new CircularNode2("Abhijeet");
        CircularNode2 n4=new CircularNode2("Avishkar");
        CircularNode2 n5=new CircularNode2("Vishnu");
        CircularNode2 n6=new CircularNode2("Vivek");
        CircularNode2 n7=new CircularNode2("Nitish");
        CircularNode2 n8=new CircularNode2("Rohan");
        CircularNode2 n9=new CircularNode2("Yash");

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n8);
        n8.setNext(n9);
        n9.setNext(n1);

        System.out.println("The Linked List:");
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The DeleteAtFirst:");
        n1=n1.deleteAtFirst(n1);
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The DeleteAtLast:");
        n1=n1.deleteAtLast(n1);
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The DeleteAtIndex:");
        n1=n1.deleteAtIndex(n1,5);
        n1.printLinkedList(n1);
    }
}
