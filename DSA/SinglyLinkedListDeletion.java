package LinkedListDataStructure;

class SinglyNode2{

    String data;
    SinglyNode2 next;

    SinglyNode2(String data){
        this.data=data;
        this.next=null;
    }

    public void setNext(SinglyNode2 next){
        this.next=next;
    }

    public void printLinkedList(SinglyNode2 head){

        while(head!=null){

            System.out.print(head.data+"->");
            head=head.next;
        }

        System.out.println("NULL");
    }

    public SinglyNode2 deleteAtFirst(SinglyNode2 head){
        head=head.next;

        return head;
    }

    public SinglyNode2 deleteAtLast(SinglyNode2 head){

        SinglyNode2 temp1=head;
        SinglyNode2 temp2=head.next;

        while(temp2.next!=null){

            temp1=temp1.next;
            temp2=temp2.next;


        }

        temp1.next=null;

        return head;
    }

    public SinglyNode2 deleteAtIndex(SinglyNode2 head, int index) {

        SinglyNode2 temp1=head;
        SinglyNode2 temp2=head.next;
        int i=1;
        while(i<index){

            temp1=temp1.next;
            temp2=temp2.next;
            i++;

        }

        temp1.next=temp2.next;

        return head;
    }
}

public class SinglyLinkedListDeletion {
    public static void main(String[] args){

        SinglyNode2 n1=new SinglyNode2("Altaf");
        SinglyNode2 n2=new SinglyNode2("Shreyash");
        SinglyNode2 n3=new SinglyNode2("Abhijeet");
        SinglyNode2 n4=new SinglyNode2("Avishkar");
        SinglyNode2 n5=new SinglyNode2("Nitish");
        SinglyNode2 n6=new SinglyNode2("Rohan");
        SinglyNode2 n7=new SinglyNode2("Pratik");
        SinglyNode2 n8=new SinglyNode2("Vishnu");
        SinglyNode2 n9=new SinglyNode2("Yash");

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n8);
        n8.setNext(n9);

        System.out.println("The Linked List:");
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The  DeleteAtFirst:");
        n1=n1.deleteAtFirst(n1);
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The  DeleteAtLast:");
        n1=n1.deleteAtLast(n1);
        n1.printLinkedList(n1);

        System.out.println("The Linked List After The  DeleteAtIndex:");
        n1=n1.deleteAtIndex(n1,3);
        n1.printLinkedList(n1);
    }
}
