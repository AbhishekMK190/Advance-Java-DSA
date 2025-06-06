import java.util.*;
import java.util.LinkedList;

public class QueueUsingCollectionFramework {
    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque<>();
        LinkedList<Integer> lst = new LinkedList();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
