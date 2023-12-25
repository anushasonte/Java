//Two numbers are entered by the user, x and n. 
//Write a function to find the value of one number raised to the power of another i.e. x^ n.

package Exercise1;

import java.util.Scanner;

public class PowerOfTwoNum {

     public static void findPower (int num, int pow)  { //function declaration
        int result = 1; 
        for(int i = 1; i<=pow; i++)
        {
           result = result * num;
        }
        System.out.println("Result is: "+result);
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Enter power: ");
        int pow = sc.nextInt();
        findPower(num, pow);  //function call
        sc.close();
        
       }
    
}
