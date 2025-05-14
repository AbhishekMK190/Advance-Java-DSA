package DFS;

import java.util.PriorityQueue;

public class MinHeapUsingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(1);
        minHeap.add(20);
        minHeap.add(5);
        minHeap.add(3);

        System.out.println("Min Heap: " + minHeap);
        System.out.println("Smallest element: " + minHeap.poll());

    }
}
