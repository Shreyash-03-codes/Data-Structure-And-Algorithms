package TreeDataStructure;

public class BinarySearchTree {

    private static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){

            this.data=data;
            this.left=null;
            this.right=null;

        }

    }

    static Node root;

    public static void insert(int val){
        if(root==null){
            root=new Node(val);
        }
        else {

            insert(root, val);
        }
    }

    private static Node insert(Node root,int val){

        if(root==null){
            return new Node(val);
        }

        if(val<root.data){
             root.left=insert(root.left,val);
        }
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void display(){
        display(root,0);
    }

    private static void display(Node root,int level){

        if(root==null){
            return;
        }

        display(root.right,level+1);
        if(level!=0){
            for(int i=1;i<level;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+root.data);
        }
        else{
            System.out.println(root.data);
        }

        display(root.left,level+1);
    }

    public static void main(String[] args) {


            BinarySearchTree.insert(14);
            BinarySearchTree.insert(12);
            BinarySearchTree.insert(22);
            BinarySearchTree.insert(13);
            BinarySearchTree.insert(18);
            BinarySearchTree.insert(26);
            BinarySearchTree.insert(9);


        BinarySearchTree.display();

    }
}
