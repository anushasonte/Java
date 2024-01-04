package Collections;

import java.util.ArrayList;

public class StackImplUsingArraylist {

   static class Stack {
        static ArrayList <Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            if(list.size() == 0){
                return true;
            }
            else{
                return false;
            }
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            int data = -1;
            if(!isEmpty()){
                data = list.get(list.size()-1);
                list.remove(list.size()-1); //removing last element from list
            }
            return data;
        }

        public static int peek(){
            int data = -1;
            if(!isEmpty()){
                data = list.get(list.size()-1);
            }
            return data;
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
        while(!Stack.isEmpty()){
            System.out.println(Stack.pop());
        }

        System.out.println("Retrieving top most element..");
        System.out.println(Stack.peek());
        
    }
    
}
