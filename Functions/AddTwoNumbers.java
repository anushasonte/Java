package Functions;
import java.util.*;
public class AddTwoNumbers {

    public static void calculateSum (int num1, int num2)  { //function declaration
        int sum = num1+num2;
        System.out.println("Sum of two given numbers is: "+sum);
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        calculateSum(num1, num2);  //function call
        sc.close();
        
       }
    
}
