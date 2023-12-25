package Patterns;
import java.util.*;

public class InvertedHalfPyramid180 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            //Inner loop for spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print("  "); 
             } //prints * * * * *
            for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}

