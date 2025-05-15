import java.util.*;

public class MinimumCostOfRopes {

    public static void main(String[] args) {

        int[] arr = {4,3,2,6};
        PriorityQueue<Long> minheap = new PriorityQueue<>();

        for(int ele : arr){
            minheap.offer((long) ele);
        }
        System.out.println(minheap);
        long res = 0;
        while(minheap.size()>1){
            long first = minheap.poll();
            long second = minheap.poll();
            long mergedLength = first+second;

            minheap.add(mergedLength);

            res = res+mergedLength;


        }
        System.out.println(res);
    }

}
