package DFS;

import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {

        int[] arr = {3,2,4,1,5,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int k = 2;

        for(int ele : arr){
            pq.add(ele);
        }

        for(int num : arr){
            if(k!=0){
                pq.poll();
                k--;
            }
        }

        System.out.println(pq.poll());

    }
}
