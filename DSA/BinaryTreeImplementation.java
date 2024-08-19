package TreeDataStructure;

import java.util.Scanner;

class BinaryTreeImplementation {

    BinaryTreeImplementation() {


    }
    private static class Node1 {

        int data;

        Node1 left;
        Node1 right;

        public Node1(int data) {

            this.data = data;
            this.left = null;
            this.right = null;

        }

    }
    public static Node1 root;



        public static void populate(Scanner sc){

            System.out.println("Enter the Root Data:");
            int val=sc.nextInt();

            root=new Node1(val);

            populate(root,sc);
        }

        private static void populate(Node1 root,Scanner sc){

            System.out.println("Enter 1 for insert the left of "+root.data+" otherwise enter 0:");
            int left=sc.nextInt();

            if(left==1){

                System.out.println("Enter the left Value:");
                int val= sc.nextInt();

                root.left=new Node1(val);

                populate(root.left,sc);

            }

            System.out.println("Enter 1 for insert the right of "+root.data+" otherwise enter 0:");
            int right=sc.nextInt();

            if(right==1){

                System.out.println("Enter the value:");
                int val=sc.nextInt();

                root.right=new Node1(val);

                populate(root.right,sc);
            }

        }

        public static void disPlay(){

            if(root==null){
                return;
            }

            disPlay(root,"");
        }

        private static void disPlay(Node1 root,String indent){

            if(root==null){
                return;
            }

            System.out.println(indent+root.data);
            disPlay(root.left,indent+"\t");
            disPlay(root.right,indent+"\t");
        }

    public static void main(String[] args) {

        BinaryTreeImplementation.populate(new Scanner(System.in));
        System.out.println("The Tree is:");
        BinaryTreeImplementation.disPlay();

    }

}