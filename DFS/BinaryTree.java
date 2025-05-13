package DFS;

import java.util.*;

public class BinaryTree {
    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data+" ");

            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
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

        levelOrderTraversal(root1);
    }

}
