package LinkedListDataStructure;

class DoublyNode1{

    String data;
    DoublyNode1 next;
    DoublyNode1 prev;

    DoublyNode1(String data){

        this.data=data;
        this.next=null;
        this.prev=null;

    }

    public void setNext(DoublyNode1 next){

        this.next=next;

    }

    public void setPrev(DoublyNode1 prev){

        this.prev=prev;

    }

    public void printLinkedListByNext(DoublyNode1 head){

        while(head!=null){

            System.out.print(head.data+"->");
            head=head.next;

        }

        System.out.println("NULL");

    }

    public void printLinkedListByPrev(DoublyNode1 tail){

        while(tail!=null){

            System.out.print(tail.data+"->");
            tail=tail.prev;

        }

        System.out.println("NULL");

    }

    public DoublyNode1 insertAtFirst(DoublyNode1 head,String data){

        DoublyNode1 newNode =new DoublyNode1(data);

        newNode.setNext(head);
        head.setPrev(newNode);

        head=newNode;

        return head;
    }

    public DoublyNode1 insertAtLast(DoublyNode1 tail,String data){

        DoublyNode1 newNode=new DoublyNode1(data);

        tail.setNext(newNode);
        newNode.setPrev(tail);

        tail=newNode;

        return tail;
    }

    public DoublyNode1 insertAtIndex(DoublyNode1 head,String data,int index){

        DoublyNode1 newNode=new DoublyNode1(data);

        int i=1;

        DoublyNode1 temp1=head;
        DoublyNode1 temp2=head.next;

        while(i<index-1){

            temp1=temp1.next;
            temp2=temp2.next;
            i++;

        }

        temp1.setNext(newNode);
        newNode.setPrev(temp1);

        newNode.setNext(temp2);
        temp2.setPrev(newNode);

        return head;

    }
}

public class DoublyLinkedListInsertion {
    public static void main(String[] args){

        DoublyNode1 n1=new DoublyNode1("Shreyash");
        DoublyNode1 n2=new DoublyNode1("Rohan");
        DoublyNode1 n3=new DoublyNode1("Pratik");
        DoublyNode1 n4=new DoublyNode1("Vivek");
        DoublyNode1 n5=new DoublyNode1("Avishkar");
        DoublyNode1 n6=new DoublyNode1("Altaf");
        DoublyNode1 n7=new DoublyNode1("Nitish");
        DoublyNode1 n8=new DoublyNode1("Yash");
        DoublyNode1 n9=new DoublyNode1("Shree");

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

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List by Previous:");
        n9.printLinkedListByPrev(n9);

        System.out.println("The Linked List After the InsertAtFirst:");
        n1=n1.insertAtFirst(n1,"Abhijeet");

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List by Previous:");
        n9.printLinkedListByPrev(n9);

        System.out.println("The Linked List After the InsertAtLast:");
        n9=n9.insertAtLast(n9,"Tommy");

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List by Previous:");
        n9.printLinkedListByPrev(n9);

        System.out.println("The Linked List After the InsertAtIndex:");
        n1=n1.insertAtIndex(n1,"Krishna",5);

        System.out.println("Linked List By Next:");
        n1.printLinkedListByNext(n1);

        System.out.println("Linked List by Previous:");
        n9.printLinkedListByPrev(n9);
    }
}
