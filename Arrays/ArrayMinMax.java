package Arrays;
import java.util.Scanner;

public class ArrayMinMax {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Integer.MAX_VALUE: "+Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: "+Integer.MIN_VALUE);

        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

      
        
        //Storing elements
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Enter number "+(i+1) + " :"); 
            numbers[i] = sc.nextInt();
        }

        //Searches for the key : linear search
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>max){
                max = numbers[i];
            }

            if(numbers[i] < min){
                min = numbers[i];
            }   
           
        }

        System.out.println("Maximum number found in array: "+max);
         System.out.println("Minimum number found in array: "+min);



        sc.close();

    }
    
}

