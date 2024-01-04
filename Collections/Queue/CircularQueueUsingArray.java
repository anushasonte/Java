package Collections.Queue;

//while removing, instead of pushing elements to beginning which took O(n) time, we will now simply increase the front to make it O(1)
// rear = (rear+1) % size;

public class CircularQueueUsingArray {

    static class CircularQueue {
        static int[] arr;
        static int size;
        static int rear = -1; //queue is empty!
        static int front = -1;

        public CircularQueue(int n){
            this.size = n;
            arr = new int[n];
        }

        public static boolean isEmpty(){
            if(rear == -1 && front == -1){
                return true;
            }
            else{
                return false;
            }
        }

        public static boolean isFull(){
            if((rear+1) % size == front){
                return true;
            }
            else{
                return false;
            }
        }

        public static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full, cannot insert!");
                return;
            }
            if(front == -1){ //adding first element
                 front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;

        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty, Cannot remove element");
                return -1;
            }
            else{
                int top = arr[front];
                if(rear == front){
                    rear = front = -1;
                }
                else {
                    front = (front+1) % size;
                }
                return top;
            }

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty, Cannot remove element");
                return -1;
            }
            else{
                int top = arr[front];
                return top;
            }
            
        }
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        System.out.println("Adding elememts to queue..");
        queue.enqueue(1);
        
        queue.enqueue(2);

        queue.enqueue(3);

        queue.enqueue(4);

        queue.enqueue(5);

        System.out.println("Removing first element..");
        System.out.println(queue.dequeue());

        System.out.println("Removing second element..");
        System.out.println(queue.dequeue());

        System.out.println("Adding two more elememts to queue..");
        queue.enqueue(6);

        queue.enqueue(7);

        while(!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
 

        
        
    }
    
}
