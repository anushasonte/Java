package Collections;

//Front: a[0]
//rear : a[last element index]
//Initially, front, rear = -1 -> empty queue
//before inserting element -> check if queue is full -> O(1)
//before removing element -> check if empty -> O(n)
//peek() : element present at front end -> O(1)

public class QueueUsingArray{

    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1; //queue is empty!

        public Queue(int n){
            this.size = n;
            arr = new int[n];
        }

        public static boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            else{
                return false;
            }
        }

        public static boolean isFull(){
            if(rear == size-1){
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
            else{
                rear++;
                arr[rear] = data;
            }

        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty, Cannot remove element");
                return -1;
            }
            else{
                int front = arr[0];
                for(int i =0;i < rear; i++){ //moving elements to the front
                    arr[i] = arr[i+1];
                }
                rear --;
                return front;
            }

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty, Cannot remove element");
                return -1;
            }
            else{
                int front = arr[0];
                return front;
            }
            
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        System.out.println("Adding elememts to queue..");
        queue.enqueue(1);
        System.out.println(queue.peek());
        
        queue.enqueue(2);
        System.out.println(queue.peek());

        queue.enqueue(3);
        System.out.println(queue.peek());

        System.out.println("Removing first element..");
        System.out.println(queue.dequeue());

        System.out.println("Removing second element..");
        System.out.println(queue.dequeue());

        System.out.println("Peek element..");
        System.out.println(queue.peek());


        
    }
    
}
