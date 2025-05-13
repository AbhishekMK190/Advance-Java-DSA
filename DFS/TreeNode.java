package DFS;

import com.sun.source.tree.Tree;

import java.util.*;

public class TreeNode {


    public static void preOrder(Node root){ //DLR
        if (root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root){ //LDR
        if (root != null) {
            inOrder(root.left);
            System.out.print((int)root.data + " ");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root){ //LRD
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }


    public static void main(String[] args) {
        Node root1 = new Node(1);

        //level 1
        root1.left = new Node(2);
        root1.right = new Node(3);

        //level 2
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        //level 3
        root1.left.right.left = new Node(9);
        root1.right.right.left = new Node(15);

        System.out.print("In order: ");
        preOrder(root1);
        System.out.println();

        System.out.print("Pre order: ");
        inOrder(root1);
        System.out.println();

        System.out.print("Post order: ");
        postOrder(root1);
        System.out.println();
    }
}
