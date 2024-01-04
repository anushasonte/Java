package Collections;

import java.util.Stack;

//Ideal queue: Insert, delete, peek : O(1)
//Implement queue using two stacks. two implementations possible.
//Push: O(n) - preferred
//Pop : O(n), Peek: O(n)

/*
Stack s1, Stack s2
If s1 is empty -> push to s1
else : pop all elements from s1 to s2 
then push to s1
then pop everything back from s2 to s1

for second element, check if s2 is empty.. so on..

Logic:
To add x: 
take an empty stack.(a)
pop all the elements from stack a to stack b.
push x to stack a
pop everything from stack b to stack a.

To remove:

*/


public class QueueUsingTwoStacks {

     static class QueueUsingStackCostlyEnqueue {

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
            while(!s1.isEmpty()){
                s2.push(s1.pop()); //popping all data from s1 and moving it to s2.
            }

            s1.push(data); //adding element to s1.

            while(!s2.isEmpty()){
                s1.push(s2.pop()); //popping all data from s2 and moving it to s2.
            }


        }

        public static int remove(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
              if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
            
        }
    }



    public static void main(String[] args) {

        QueueUsingStackCostlyEnqueue queue = new QueueUsingStackCostlyEnqueue();

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
