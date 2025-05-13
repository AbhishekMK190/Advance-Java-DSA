package DFS;

import java.util.*;

public class BST {

    public static void inOrder(Node root){ //LDR
        if (root != null) {
            inOrder(root.left);
            System.out.print((int)root.data + " ");
            inOrder(root.right);
        }
    }

    //Insert element into the tree
    static Node insert(Node root , int data){
        if(root == null){
            return new Node(data);
        }

        if(data<root.data){
            root.left = insert(root.left,data);
        }
        else if(data>root.data){
            root.right = insert(root.right,data);
        }

        return root;
    }

    //Search elements in the tree
    static Node search(Node root , int data){

        if(root == null || root.data == data){
            return root;
        }

        if(root.data<data){
            return search(root.right,data);
        }
        return search(root.left,data);
    }

    //Delete a node from the tree
//    static Node delete(Node root,int data){
//
//        if(root == null){
//            return root;
//        }
//
//        if(root.data>data){
//            root.left =  delete(root.left,data);
//        }
//        else if(root.data<data){
//            root.right =  delete(root.right,data);
//        }
//
//        else{
//            if(root.data)
//        }
//    }

    public static void main(String[] args) {
        Node root1 = new Node(50);

        int[] arr = {30,40,80,70,90};

        for(int ele : arr){
            insert(root1,ele);
        }

        inOrder(root1);
        System.out.println();

    }
}
