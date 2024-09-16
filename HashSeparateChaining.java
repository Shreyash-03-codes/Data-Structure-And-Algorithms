package HashDataStructure;

 class HashMap{

    private static class Node{
        String data;
        Node next;
        int key;

        Node(int key,String data){
            this.data=data;
            this.key=key;
            this.next=null;
        }

        public String getData(){
            return this.data;
        }

        public int getKey(){
            return this.key;
        }
    }

     int N=39;

     Node[] hash=new Node[N];

    private  int hashCode(int key){
        return key%N;
    }

    public  void insert(int key,String value){
        int code=hashCode(key);

        if(hash[code]==null){
            hash[code]=new Node(key,value);
        }
        else{
            Node temp=hash[code];

            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=new Node(key,value);
        }
    }

    public  String get(int key){

        int code=hashCode(key);
        if(hash[code]==null){
            return null;
        }

        else if(hash[code].getKey()==key){
            return hash[code].getData();
        }
        else{
            Node temp=hash[code];

            while(temp!=null){
                if(temp.getKey()==key){
                    return temp.getData();
                }
                temp=temp.next;
            }
        }

        return null;

    }

    public  void remove(int key){

        int code=hashCode(key);

        if(hash[code]==null){
            return;
        }
        else if(hash[code].getKey()==key){
            hash[code]=null;
        }
        else{

            Node temp1=hash[code];
            Node temp2=hash[code].next;

            while(temp2!=null){
                if(temp2.getKey()==key){
                    temp1.next=temp2.next;
                    return;
                }
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
    }

    public  void display(){

        for(int i=0;i<N;i++){

            if(hash[i]!=null){
                if(hash[i].next==null){
                    System.out.println(hash[i].getKey()+"->"+hash[i].getData());
                }
                else{

                    Node temp=hash[i];

                    while(temp!=null){
                        System.out.println(temp.getKey()+"->"+temp.getData());
                        temp=temp.next;
                    }
                }
            }
        }
    }

}
public class HashSeparateChaining {
    public static void main(String[] args) {
        HashMap map=new HashMap();

        map.insert(39,"Shreyash");
        map.insert(78,"Yash");
        map.insert(45,"Abhijeet");
        map.insert(12,"Pratik");
        map.insert(46,"Altaf");
        map.insert(13,"Nitish");
        map.insert(38,"Avishkar");
        map.insert(14,"Vishnu");

        System.out.println("The HashMap Elements:");
        map.display();


        map.remove(13);

        System.out.println("The HashMap Elements");
        map.display();

        System.out.println(map.get(78));
    }
}
