package Collections;
import java.util.Stack;

//Push elements at the bottom of Stack
/*
Example:
existing elements in Stack : 1, 2, 3
New element : 4
Output: 4, 1, 2, 3
*/

public class PushAtBottomOfStack {

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){ //base condition
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s); //recursion;
        s.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing data into Stack..");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pushing data into bottom of Stack..");
        pushAtBottom(4,stack);
        pushAtBottom(5,stack);

        System.out.println("Retrieving top most element..");
        System.out.println(stack.peek());

        System.out.println("Popping elements from Stack..");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
        
    }
    
}
