import org.w3c.dom.Node;
import java.util.*;

public class StackClass {

    static class StackUsingLinkedList{
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                next = null;
            } 
        }

        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);          // newNode-->data-->null
            newNode.next = head;                    // newNode-->data-->head;
            head = newNode;                         //head-->newNode
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
    }

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args){

        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(1);
        s.push(2);
        s.push(2);
        s.push(1);

        while(!s.isEmpty()){
            System.out.println("This is the top element before popping!: " + s.peek());
            System.out.println("The element "+s.pop()+" is popped");
        }
    }
}
