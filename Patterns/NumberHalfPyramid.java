package Patterns;
import java.util.*;

public class NumberHalfPyramid {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            //for spaces
            for(int j=1; j<= rows-i;j++){    
                System.out.print(" ");
            }

            //for number
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");  
            }
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}




