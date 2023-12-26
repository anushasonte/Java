package Arrays;
import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();

        String numbers[] = new String[size];
        
        //Storing elements
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Enter name "+(i+1) + " :"); 
            numbers[i] = sc.next();

        }

        System.out.println("Printing elements of array.."); 
        //Prints the elements
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]); //Will print 0 as the default value of int is 0 in java.
        }

        sc.close();
     }
    
}

