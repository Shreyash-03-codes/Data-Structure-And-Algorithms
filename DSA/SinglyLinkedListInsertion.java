package LinkedListDataStructure;
class SinglyNode1{

    private String data;
    private SinglyNode1 next;

    SinglyNode1(String data){
        this.data=data;
        this.next=null;
    }

    public void printLinkedList(SinglyNode1 head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("NULL");
    }

    public void setNext(SinglyNode1 node){
        this.next=node;
    }

    public SinglyNode1 insertAtFirst(SinglyNode1 head,String data){

        SinglyNode1 newNode=new SinglyNode1(data);

        newNode.next=head;

        head=newNode;

        return head;
    }

    public SinglyNode1 insertAtLast(SinglyNode1 head,String data){

        SinglyNode1 newNode=new SinglyNode1(data);

        SinglyNode1 temp=head;

        while(temp.next!=null){

            temp=temp.next;

        }

        temp.next=newNode;

        return head;
    }

    public SinglyNode1 insertAtIndex(SinglyNode1 head,String data,int index){

        SinglyNode1 newNode=new SinglyNode1(data);

        SinglyNode1 temp1=head;
        SinglyNode1 temp2=head.next;
        int i=1;
        while(i<index-1){

            temp1=temp1.next;
            temp2=temp2.next;
            i++;

        }

        temp1.next=newNode;
        newNode.next=temp2;

        return head;
    }
}
public class SinglyLinkedListInsertion {
    public static void main(String[] args){


        SinglyNode1 n1=new SinglyNode1("Shreyash");
        SinglyNode1 n2=new SinglyNode1("Pratik");
        SinglyNode1 n3=new SinglyNode1("Rohan");
        SinglyNode1 n4=new SinglyNode1("Yash");
        SinglyNode1 n5=new SinglyNode1("Nitish");
        SinglyNode1 n6=new SinglyNode1("Vivek");
        SinglyNode1 n7=new SinglyNode1("Altaf");

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);

        System.out.println("Linked List:");
        n1.printLinkedList(n1);

        System.out.println("Linked List After The InsertAtFirst:");
        n1=n1.insertAtFirst(n1,"Abhijeet");
        n1.printLinkedList(n1);

        System.out.println("Linked List After The InsertAtLast:");
        n1=n1.insertAtLast(n1,"Avishkar");
        n1.printLinkedList(n1);

        System.out.println("Linked List After The InsertAtIndex:");
        n1=n1.insertAtIndex(n1,"Vishnu",5);
        n1.printLinkedList(n1);
    }
}
