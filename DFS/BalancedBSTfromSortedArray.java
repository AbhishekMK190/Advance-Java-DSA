package DFS;

import java.util.*;

public class BalancedBSTfromSortedArray {

    public static void inOrder(Node root){ //LDR
        if (root != null) {
            inOrder(root.left);
            System.out.print((int)root.data + " ");
            inOrder(root.right);
        }
    }

    static Node sortedBalBinTree(int[] arr , int start , int end){
        if(start>end){
            return null;
        }
        int mid = (start-end)/2 + end;
        Node root = new Node(arr[mid]);

        root.left = sortedBalBinTree(arr,start,mid-1); //storing the left part from the middle element in the array

        root.right = sortedBalBinTree(arr,mid+1,end);  // Storing the right part from the middle element in the array
        return root;
    }

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length-1;

        inOrder(sortedBalBinTree(arr,start,end));
    }

}
