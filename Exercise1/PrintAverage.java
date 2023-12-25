//Enter 3 numbers from the user & make a function to print their average

package Exercise1;
import java.util.*;
public class PrintAverage {

    public static void calculateAvg (int num1, int num2, int num3)  { //function declaration
        int avg = (num1+num2+num3)/3;
        System.out.println("Average of three given numbers is: "+avg);
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();
        calculateAvg(num1, num2, num3);  //function call
        sc.close();
        
       }
    
}

