package Linked_List;
import java.util.Stack;

public class Methods {
    public static class Node {
        int data;
        Node next;
        Node prev;

        //Parameterized Constructor
        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    static Node head;

    //Adds element at the end of the linked list
    public static void add(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    //Displays Element to the user in the terminal
    public static void show() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void addAtFirst(int data) {
        Node n1 = new Node(data);
        n1.next = head;
        head = n1;
    }

    //Add an node specified at a particular index
    public static void addAt(int idx, int data) {
        Node n1 = new Node(data);
        Node temp = head;
        Node prev = null;
        int index = 1;

        while (temp != null && index <= idx) {
            if (index <= idx) {
                prev = temp;
                temp = temp.next;
                index++;
            }
            if (index == idx) {
                if (prev == null) {
                    n1.next = head;
                    head = n1;
                } else {
                    prev.next = n1;
                    n1.next = temp;
                }
            }
        }
    }


    //Remove node from a specified index
    public void remove(int idx){
        Node temp = head;
        Node prev = null;
        int index = 0;
        while(temp.next!=null && index<idx){
            prev = temp;
            temp = temp.next;
            index++;
        }
        prev.next = temp.next;
    }

    //Remove the first node from the linked list
    public void removeFirst(){
        Node n1 = head;
        head = n1.next;
    }

    //Remove the last node from the linked list
    public void removeLast(){
        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    //Remove specific data from the linked list
    public void removeData(int data){
        Node temp = head;
        Node prev = null;
        int idx = 0;
        while(temp!=null){
            if(temp.data == data ){
                if(prev == null){
                    head = temp.next;
                }
                else{
                    prev.next = temp.next;
                }
                System.out.println("Element "+data+" removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Element not found!");
    }

    //Reversal of a linked List
    public void LL_Reversal(){
        Node temp1 = head;
        Stack<Integer> stack = new Stack<>();

        Node temp2 = head;
        while(temp1!=null){
            stack.push(temp1.data);
            temp1 = temp1.next;
        }
//        System.out.println(stack);
        int Stack_size = stack.size();
        for(int i = 0 ; i<Stack_size ; i++){
            int num = stack.pop();
            temp2.data = num;
            temp2 = temp2.next;
        }
    }

    //Reversal of linked List at given size
    public static void LL_Reversal_at_givenSize(int size){
        Node temp = head;
        Node temp1 = head;
        Stack<Integer> stack = new Stack<>();
        int index = 0;

        if(size<2){
            System.out.println("Size should be greater than or equal to 2!!!");
            return;
        }
       while(temp.next!=null){
        //Pushing elements till size
        while(temp!=null && index<size){
            stack.push(temp.data);
            temp = temp.next;
            index++;
        }

//        System.out.println(stack);

        while(!stack.isEmpty()){
            temp1.data = stack.pop();
            temp1 = temp1.next;
        }

    }
}
}
