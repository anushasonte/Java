package Collections.Stack;

//STACK - LIFO data structure!
//PUSH, POP, PEEK OPERATIONS

//Push - adding element into Stack : O(1)
//Pop - removing top most element from Stack : O(1)
//peek - retrieve top element from Stack : O(1)

//stackfull() - stackoverflow and stackEmpty() functions before pushing and popping elements from stack! 

//Implementation:
//Using Array! : fixed size!
//Using Linkedlist - variable size ; new element added will be head. 
//Using Arraylist - variable size

public class StackImplUsingLinkedlist {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static class Stack {
        public static Node head;

        public static boolean isStackEmpty(){
            if(head == null){
                return true;
            }
            else{
                return false;
            }
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(isStackEmpty()){
                head = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }

        }

        public static int pop(){
            int top = -1;
            if(!isStackEmpty()){
                top = head.data;
                head = head.next;
            }
            return top;
        }

        public static int peek(){
            int top = -1;
            if(!isStackEmpty()){
                top = head.data;
            }
            return top;
        }

    }

    public static void main(String[] args) {

        System.out.println("Pushing data into Stack..");
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);

        System.out.println("Retrieving top most element..");
        System.out.println(Stack.peek());

        System.out.println("Popping elements from Stack..");
        while(!Stack.isStackEmpty()){
            System.out.println(Stack.pop());
        }

        System.out.println("Retrieving top most element..");
        System.out.println(Stack.peek());

    }

}
