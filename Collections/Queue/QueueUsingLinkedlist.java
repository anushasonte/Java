package Collections.Queue;

/*
add():
Create newNode.
tail->next = newNode
tail = newNode

remove():
head = head->next;
it will be garbage collected.

peek():
head->data
*/

public class QueueUsingLinkedlist {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static class QueueUsingLL {
        static int[] arr;
        static int size;
        
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            if(head == null && tail == null){
                return true;
            }
            else{
                return false;
            }
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty, Cannot remove element");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty, Cannot remove element");
                return -1;
            }
            else{
                int front = head.data;
                return front;
            }
            
        }
    }





      public static void main(String[] args) {

        QueueUsingLL queue = new QueueUsingLL();

        System.out.println("Adding elememts to queue..");
        queue.add(1);
        
        queue.add(2);

        queue.add(3);

        queue.add(4);

        queue.add(5);

        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }


        
    }


    
}
