package Arrays;
import java.util.Scanner;

public class ArrayWithCustomSize {

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

        System.out.println("Printing elements of array.."); 
        //Prints the elements
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]); //Will print 0 as the default value of int is 0 in java.
        }

        sc.close();
     }
    
}
