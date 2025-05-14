package DFS;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapUsingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(1);
        maxHeap.add(20);
        maxHeap.add(5);
        maxHeap.add(3);
        maxHeap.add(21);

        System.out.println("Max Heap: " + maxHeap );
        System.out.println("Largest Element: " + maxHeap.poll());

    }
}
