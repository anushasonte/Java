package Functions;
import java.util.*;
public class Factorial {

    public static void calculateFactorial (int num)  { //function declaration
        if(num<0)
        {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=num; i>=1; i--)
        {
            factorial = factorial * i;  
        }
        System.out.println("Factorial of given numnber is: "+factorial);
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        //int product =  calculateProduct(num1, num2);  //function call
        calculateFactorial(num);
        sc.close();
        
       }
    
}
