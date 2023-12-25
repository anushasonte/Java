//Sum of first n natural numbers
import java.util.*;
public class SumOfFirstNnaturalNum{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");

        int n = sc.nextInt();
        int sum = 0;
        
        //Method-1 using loops
        for(int i=1 ; i<=n; i++)
        {
            sum = sum + i;
        }

        System.out.println("Result using loops: "+sum);

        //Method-2 using formula

        sum = (n * (n+1))/2;
        System.out.println("Result using formula: "+sum);




    sc.close();
        
    }


    
}
