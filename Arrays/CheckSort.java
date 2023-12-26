//Take an array of numbers as input and check if it is an array sorted in ascending order.
/* Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        {3, 4, 6, 2} is not sorted in ascending order. */

package Arrays;
import java.util.*;
public class CheckSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        boolean isAscending = false;

        
        //Storing elements
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Enter number "+(i+1) + " :"); 
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i] < numbers[i+1])
            isAscending = true;
            else
            isAscending = false;
        }


        if(isAscending)
        System.out.println("Array is sorted in ascending order!");
        else
        System.out.println("Array is not sorted in ascending order!");


        sc.close();
        
    }

    


    
}
