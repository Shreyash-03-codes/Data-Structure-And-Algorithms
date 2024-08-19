package TreeDataStructure;

import java.util.Scanner;

public class AVLTree {

    AVLTree(){

    }

    private static class Node{

        int data;
        Node left;
        Node right;
        int height;

        Node(int val){

            this.data=val;
            this.left=null;
            this.right=null;

        }

        public  int getData(){
            return this.data;
        }
    }

    private static int getHeight(Node node){

        if(node==null){
            return -1;
        }

        return node.height;
    }

    static Node root=null;

    public static void insert(int val){

            root=insert(root,val);

    }

    private static Node insert(Node node,int val){
        if(node==null){
            node= new Node(val);
            return node;
        }

        if(val<node.getData()){
            node.left=insert(node.left,val);
        }
        if(val>node.getData()){
            node.right=insert(node.right,val);
        }

        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;

        return rotate(node);
    }

    private static Node rotate(Node node){

        if(getHeight(node.left)-getHeight(node.right)>1){
            //Left Weighted

            if(getHeight(node.left.left)-getHeight(node.left.right)>0){
                //Left-Left
                return rotateRight(node);

            }

            if(getHeight(node.left.left)-getHeight(node.left.right)<0){
                //Left-Right

                node.left=rotateLeft(node.left);
                return rotateRight(node);
            }

        }

        if(getHeight(node.left)-getHeight(node.right)<-1){
            //Right Weighted

            if(getHeight(node.right.left)-getHeight(node.right.right)<0){
                //Right-Right

                return rotateLeft(node);

            }

            if(getHeight(node.right.left)-getHeight(node.right.right)>0){
                //Right-Left

                node.right=rotateRight(node.right);
                return rotateLeft(node);
            }
        }

        return node;

    }

    private static Node rotateRight(Node p){

        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;

        c.height=Math.max(getHeight(c.left),getHeight(c.right))+1;
        p.height=Math.max(getHeight(p.left),getHeight(p.right))+1;

        return c;

    }

    private static Node rotateLeft(Node c){

        Node p=c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;

        c.height=Math.max(getHeight(c.left),getHeight(c.right))+1;
        p.height=Math.max(getHeight(p.left),getHeight(p.right))+1;

        return p;

    }

    public static boolean balanced(){
        return balanced(root);
    }

    private static boolean balanced(Node node){
        if(node==null){
            return true;
        }

        return Math.abs(getHeight(node.left)-getHeight(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public static void display(){

        display(root,"");
    }

    private static void display(Node node,String indent){

        if(node==null){
            return;
        }

        System.out.println(indent+node.getData());

        display(node.left,indent+"\t");
        display(node.right,indent+"\t");

    }


    public static void prettyDisplay(){

        prettyDisplay(root,0);

    }

    private static void prettyDisplay(Node node,int level){
        if(node==null){
            return;
        }

        prettyDisplay(node.right,level+1);

        if(level!=0){
            for(int i=1;i<level;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.getData());
        }
        else{
            System.out.println(node.getData());
        }
        prettyDisplay(node.left,level+1);
    }



    public static void main(String[] args) {

//        populate(new int[]{2,4,6,8,10,12,14,16,18});

        for (int i = 4; i < 100; i+=5) {
            AVLTree.insert(i);
        }

        System.out.println("The Tree is :");

        display();

        System.out.println("The Tree is:");
        prettyDisplay();
//        System.out.println("the tree is Balanced:"+balanced());
        System.out.println(getHeight(root));

    }
}
