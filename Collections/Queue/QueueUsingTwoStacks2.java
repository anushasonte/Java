package Collections.Queue;

import java.util.Stack;

//this is the second approach
//here dequeue will be costly.
//peek operation is nothing but remove() without removing the top element. hence it has time complexity of O(n)

public class QueueUsingTwoStacks2 {


     static class QueueUsingStackCostlyDeque {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            if(s1.isEmpty() && s2.isEmpty()){
                return true;
            }
            else{
                return false;
            }
        }

        public static void add(int data){
            s1.push(data);
        }

        public static int remove(){
            if(s1.isEmpty() && s2.isEmpty()){
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }

        public static int peek(){
            if(s1.isEmpty() && s2.isEmpty()){
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
            
        }
    }


    public static void main(String[] args) {

        QueueUsingStackCostlyDeque queue = new QueueUsingStackCostlyDeque();

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
