package DFS;

import com.sun.source.tree.Tree;

import java.util.*;

public class TreeNode {
    int data;

    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.right = this.left = null;
    }
    public static void preOrder(TreeNode root){ //DLR
        if (root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(TreeNode root){ //LDR
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void postOrder(TreeNode root){ //LRD
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);

        //level 1
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        //level 2
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        //level 3
        root1.left.right.left = new TreeNode(9);
        root1.right.right.left = new TreeNode(15);

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
