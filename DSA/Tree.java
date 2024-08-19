package TreeDataStructure;

import java.util.Scanner;

public class Tree{

    Tree(){

    }
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

    public static void populate(Scanner sc){

        System.out.println("Enter the Root Value:");
        root=new Node(sc.nextInt());

        populate(root,sc);
    }

    private static void populate(Node root,Scanner sc){

        System.out.println("Enter 1 for add the left of "+root.data+" otherwise enter 0:");
        int left=sc.nextInt();

        if(left==1){
            System.out.println("Enter the left value:");
            root.left=new Node(sc.nextInt());

            populate(root.left,sc);
        }

        System.out.println("Enter 1 for add the right of "+root.data+" otherwise enter 0:");
        int right=sc.nextInt();

        if(right==1){
            System.out.println("Enter the right value:");
            root.right=new Node(sc.nextInt());

            populate(root.right,sc);
        }

    }

    public static void display(){

        display(root,"");
    }

    private static void display(Node root,String indent){

        if(root==null){
            return;
        }

        System.out.println(indent+root.data);

        display(root.left,indent+"\t");
        display(root.right,indent+"\t");
    }

    public static void prettyDisplay(){

        prettyDisplay(root,0);

    }

    private static void prettyDisplay(Node root,int level){

        if(root==null){
            return;
        }

        prettyDisplay(root.right,level+1);

        if(level!=0) {
            for (int i = 1; i < level; i++) {
                System.out.print("|\t\t");
            }

            System.out.println("|---->"+root.data);
        }
        else{
            System.out.println(root.data);
        }

        prettyDisplay(root.left,level+1);
    }

    public static void main(String[] args) {

        Tree.populate(new Scanner(System.in));

        System.out.println("The Tree is :");

//        display();
        prettyDisplay();
    }

}