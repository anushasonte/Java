package Collections;

import java.util.Stack;

public class StackUsingCollections {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing data into Stack..");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Retrieving top most element..");
        System.out.println(stack.peek());

        System.out.println("Popping elements from Stack..");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
    }
    
}
