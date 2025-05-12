package DFS;

import java.util.*;

public class BinaryTree {
    static void levelOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
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

        levelOrderTraversal(root1);
    }

}
