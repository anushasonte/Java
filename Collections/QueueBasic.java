package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

//Queue : FIFO data structure!
//Front end: Remove elements from this end. -> dequeue -> remove()
//Rear end: Add elements from this end. -> enqueue -> add()
//peek() : element present at front end

public class QueueBasic {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        System.out.println("Adding elememts to queue..");
        queue.add(1);
        
        queue.add(2);

        queue.add(3);

        queue.add(4);

        queue.add(5);

        System.out.println("Removing first element..");
        System.out.println(queue.remove());

        System.out.println("Removing second element..");
        System.out.println(queue.remove());

        System.out.println("Adding two more elememts to queue..");
        queue.add(6);

        queue.add(7);

        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }


        
    }
    
}
