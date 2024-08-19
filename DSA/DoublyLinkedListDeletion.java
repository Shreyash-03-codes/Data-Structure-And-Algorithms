package LinkedListDataStructure;

class DoublyNode2{

    String data;
    DoublyNode2 next;
    DoublyNode2 prev;

    DoublyNode2(String data){

        this.data=data;
        this.next=null;
        this.prev=null;

    }

    public void setNext(DoublyNode2 next){

        this.next=next;

    }
    public void setPrev(DoublyNode2 prev){

        this.prev=prev;

    }

    public void printLinkedListByNext(DoublyNode2 head){

        while(head!=null){

            System.out.print(head.data+"->");
            head=head.next;

        }
        System.out.println("NULL");
    }

    public void printLinkedListByPrev(DoublyNode2 tail){

        while(tail!=null){

            System.out.print(tail.data+"->");
            tail=tail.prev;

        }
        System.out.println("NULL");
    }

    public DoublyNode2 deleteAtFirst(DoublyNode2 head){

        DoublyNode2 temp=head.next;

        temp.setPrev(head.prev);

        head=temp;

        return head;

    }

    public DoublyNode2 deleteAtLast(DoublyNode2 tail){

        DoublyNode2 temp=tail.prev;

        temp.setNext(tail.next);

        tail=temp;

        return tail;
    }

    public DoublyNode2 deleteAtIndex(DoublyNode2 head,int index){

        int i=1;
        DoublyNode2 temp1=head;
        DoublyNode2 temp2=head.next;

        while(i<index){

            temp1=temp1.next;
            temp2=temp2.next;
            i++;

        }

        temp1.setNext(temp2.next);
        temp2.next.setPrev(temp1);

        return head;

    }

}
public class DoublyLinkedListDeletion {
    public static void main(String[] args){

        DoublyNode2 n1=new DoublyNode2("Altaf");
        DoublyNode2 n2=new DoublyNode2("Vivek");
        DoublyNode2 n3=new DoublyNode2("Shreyash");
        DoublyNode2 n4=new DoublyNode2("Abhijeet");
        DoublyNode2 n5=new DoublyNode2("Rohan");
        DoublyNode2 n6=new DoublyNode2("Nitish");
        DoublyNode2 n7=new DoublyNode2("Vishnu");
        DoublyNode2 n8=new DoublyNode2("Yash");
        DoublyNode2 n9=new DoublyNode2("Pratik");
        DoublyNode2 n10=new DoublyNode2("Krishna");
        DoublyNode2 n11=new DoublyNode2("Avishkar");
        DoublyNode2 n12=new DoublyNode2("Tommy");

        n1.setNext(n2);

        n2.setPrev(n1);
        n2.setNext(n3);


        n3.setPrev(n2);
        n3.setNext(n4);

        n4.setPrev(n3);
        n4.setNext(n5);

        n5.setPrev(n4);
        n5.setNext(n6);

        n6.setPrev(n5);
        n6.setNext(n7);

        n7.setPrev(n6);
        n7.setNext(n8);

        n8.setPrev(n7);
        n8.setNext(n9);

        n9.setPrev(n8);
        n9.setNext(n10);

        n10.setPrev(n9);
        n10.setNext(n11);

        n11.setPrev(n10);
        n11.setNext(n12);

        n12.setPrev(n11);

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List By Previous:");
        n12.printLinkedListByPrev(n12);


        System.out.println("Linked List After The DeleteAtFirst:");
        n1=n1.deleteAtFirst(n1);

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List By Previous:");
        n12.printLinkedListByPrev(n12);


        System.out.println("Linked List After The DeleteAtLast:");
        n12=n12.deleteAtLast(n12);

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List By Previous:");
        n12.printLinkedListByPrev(n12);


        System.out.println("Linked List After The DeleteAtIndex:");
        n1=n1.deleteAtIndex(n1,4);

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List By Previous:");
        n12.printLinkedListByPrev(n12);
    }
}
