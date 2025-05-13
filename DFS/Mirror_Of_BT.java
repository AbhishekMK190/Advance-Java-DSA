package DFS;

import java.util.*;
import DFS.*;

public class Mirror_Of_BT {

    public static void inOrder(Node root){ //LDR
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static Node mirrTree(Node root){
        if(root == null){
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left!=null){
            mirrTree(root.left);
        }

        if(root.right!=null){
            mirrTree(root.right);
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        //level 1
        root.left = new Node(2);
        root.right = new Node(3);

        //level 2
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        inOrder(root);
        System.out.println();
        inOrder(mirrTree(root));

    }

}
