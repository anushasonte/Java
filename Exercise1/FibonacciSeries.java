//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

package Exercise1;
import java.util.*;
public class FibonacciSeries {

    public static void printFibonacciSeries (int num)  { //function declaration
        int a = 0; 
        int b = 1;
        System.out.print(a + " ");
        if (num>1){
        for(int i = 1; i<=num; i++){
           System.out.print(b + " ");
           int temp =b;
           b  = a+b;
           a = temp;
        }
        System.out.println();
        }
        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        printFibonacciSeries(num);  //function call
        sc.close();
        
       }
    
}
