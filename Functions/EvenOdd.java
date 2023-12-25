package Functions;
import java.util.*;
public class EvenOdd {

    public static void checkEvenOdd (int num)  { //function declaration
        if(num % 2 == 0)
        {
            System.out.println("It is an even number!");
        }
        else
        {
            System.out.println("It is an odd number!");
        }
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        //int product =  calculateProduct(num1, num2);  //function call
        checkEvenOdd(num);
        sc.close();
        
       }
    
}

