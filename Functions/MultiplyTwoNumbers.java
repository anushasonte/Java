package Functions;
import java.util.*;
public class MultiplyTwoNumbers {

    public static int calculateProduct (int num1, int num2)  { //function declaration
        int product = num1*num2;
        return product; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        //int product =  calculateProduct(num1, num2);  //function call
        System.out.println("Sum of two given numbers is: "+calculateProduct(num1, num2));
        sc.close();
        
       }
    
}
