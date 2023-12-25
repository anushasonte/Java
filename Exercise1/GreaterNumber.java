//Write a function which takes in 2 numbers and returns the greater of those two.


package Exercise1;
import java.util.*;
public class GreaterNumber {

    public static void findGreaterNumber (int num1, int num2)  { //function declaration
        if(num1>num2)
        System.out.println("Number 1 is greater!");
        else if (num1==num2)
        System.out.println("Both numbers are equal!");
        else
        System.out.println("Number 2 is greater!");

        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        findGreaterNumber(num1, num2);  //function call
        sc.close();
        
       }
    
}


