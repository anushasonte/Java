package Arrays;
import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        
        //Storing elements
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Enter number "+i + " :"); 
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter number to find: ");
        int key = sc.nextInt();

        //Searches for the key : linear search
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==key)
            System.out.println("Number " + key+ " found at index: "+i); //Will print 0 as the default value of int is 0 in java.
        }



        sc.close();

    }
    
}
