/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user. */

import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("------- CALCULATOR MENU --------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("-----------------------------------");

        System.out.println("Enter option number: ");
        int option = sc.nextInt();
        int result;

        switch(option){
            case 1 :result = a+b;
                    break;
            case 2: result = a-b;
                    break;
            case 3: result = a*b;
                    break;
            case 4: result = a/b;
                    break;
            case 5: result = a%b;
                    break;
            default: {
                    result = 0;
                    System.out.println("Invalid choice!");
                  } 
        }

        System.out.println("Result of operation: "+result);

        sc.close();


    }
    
}
