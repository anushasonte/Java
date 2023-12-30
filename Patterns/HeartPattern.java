package Patterns;
import java.util.*;

public class HeartPattern {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

            //for upper half
            for (int i = rows / 2; i <= rows; i += 2) {
                for (int j = 1; j < rows - i; j += 2) {
                    System.out.print(" ");
                }
    
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
    
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
    
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
    
                System.out.println();
            }
            //for lower half
            for (int i = rows; i >= 0; i--) {
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
    
                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
    
                System.out.println();
            }

        sc.close();
        
    }
    
}




