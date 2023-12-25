package Patterns;
import java.util.*;

public class ButterflyPattern {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

        //upper half of the pattern
        for(int i=1;i<=rows;i++){
            //to print first set of stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");  
            }
            //to print spaces 
            int spaces = 2*(rows-i);
            for(int j=1;j<= spaces;j++){
                 System.out.print("  "); 
            }
            //to print next set of stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");  
            }  
            System.out.print("\n");
        }
        
        //lower half of the pattern
         for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");  
            }
            int spaces = 2*(rows-i);
            for(int j=1;j<= spaces;j++){
                 System.out.print("  "); 
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");  
            }  
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}

