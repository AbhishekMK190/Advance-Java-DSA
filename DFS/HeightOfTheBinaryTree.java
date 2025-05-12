package DFS;

import com.sun.source.tree.Tree;

import java.sql.SQLOutput;

class Node{
    int data;
    Node left;
    Node right;

    Node(int x){
        data = x;
        left = right = null;
    }
}

public class HeightOfTheBinaryTree {

    static int FindHeight(Node root){
        if(root == null) return 0;
        int leftHeight = FindHeight(root.left);
        int rightHeight = FindHeight(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
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

        System.out.println();
        //System.out.println("Test1");
        //System.out.println("Test2");
        System.out.println("Height of the Binary tree is: " + FindHeight(root1));
    }

}
