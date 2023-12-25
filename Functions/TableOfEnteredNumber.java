package Functions;

//Table of entered number
import java.util.*;
public class TableOfEnteredNumber{

    public static void printTable (int n)  { //function declaration

        for(int i=1 ; i<=10; i++)
        {
             System.out.println(n + " * " + i + " = " +(n*i));
        }

        return; //return to the caller ; not mandatory for void
       }
  
  
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        printTable(num);
        sc.close();
        
       }


    
}


