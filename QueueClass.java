public class QueueClass {

    public static class Queue{

        static int[] arr;
        static int size;
        static int rear = -1;

        //isEmpty
        public static boolean isEmpty(){
            return rear == -1;
        }

        //isFull
        public static boolean isFull(){
            return rear == size-1;
        }

        //enque
        public static void add(int data){
            if(isFull()){
                System.out.println("Overflow!");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i<rear ; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            return arr[0];
        }
    }

    //Circular Queue
    public static class CircQueue{

        static int[] arr;
        static int size;
        static int rear=-1;
        static int front=-1;

        //isEmpty method
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //isFull method
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        // {1,2,3,4,5,6}

        //enque
        public static void add(int data){
            if(isFull()){
                System.out.println("Overflow!");
            }

            if(front == -1) front = 0;

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            int res = arr[front];
            //To check if a queue has only one element and then reinitialize the values to -1 to indicate queue is empty
            if(rear == front){
                rear = -1;
                front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return res;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            return arr[front];
        }

    }

    public static class QueueUsingLinkedList{
        public static class Node {
            int data;
            Node next;

            Node(int data){
                this.data = data;
                next = null;
            }
        }

        static Node head = null;
        static Node tail = null;

            //isEmpty method
            public static boolean isEmpty(){
                return head == null && tail == null;
            }

            //enque
            public static void add(int data){
                Node newNode = new Node(data);
                if(tail == null){
                    tail = head = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }

            //dequeue
            public static int remove(){
                if(head == null){
                    throw new IllegalStateException("The Linked list is empty!");
                }
                int front = head.data;
                if(isEmpty()){
                    System.out.println("Linked list is empty!");
                    return -1;
                }
                head = head.next;
                return front;
            }

            //peek
            public static void peek(){
                if(isEmpty()){
                    System.out.println("Linked List is empty!");
                    return;
                }
                if(head == null){
                    throw new IllegalStateException("The linked list is empty!");
                }
                System.out.println(head.data);
            }
    }

    public static void main(String[] args){
        QueueUsingLinkedList ll = new QueueUsingLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        while(!ll.isEmpty()){
            ll.peek();
            ll.remove();
        }
    }
}
