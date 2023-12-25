//Write a function to print the sum of all odd numbers from 1 to n.


package Exercise1;
import java.util.*;
public class SumOfAllOddNumbers {

    public static void calculateOddSum (int num)  { //function declaration
        int sum = 0;
        for(int i=1; i<=num; i++)
        {
            if(i % 2 !=0)
            {
                sum = sum+i;
            }
        } 
        System.out.println("Sum of all odd numbers till given number is: "+sum);
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        calculateOddSum(num);  //function call
        sc.close();
        
       }
    
}

