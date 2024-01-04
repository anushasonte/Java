package Collections;
import java.util.Stack;

/*
Input stack: 1, 2, 3
Output stack : 3, 2, 1 
*/


public class ReverseAStack {

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){ //base condition
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s); //recursion;
        s.push(top);
    }

    public static void reverseStack (Stack<Integer> rs){
        if(rs.isEmpty()){ //Base condition
            return;
        }
        int top = rs.pop();
        reverseStack(rs);
        pushAtBottom(top,rs);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        System.out.println("Pushing data into Stack..");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Retrieving top most element..");
        System.out.println(stack.peek());

        System.out.println("After reversal..");
        reverseStack(stack);
        System.out.println("Retrieving top most element..");
        System.out.println(stack.peek());

        System.out.println("Popping elements from Stack..");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        
    }
    
}
