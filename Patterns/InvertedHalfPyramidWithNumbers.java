package Patterns;
import java.util.*;

public class InvertedHalfPyramidWithNumbers {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(rows-i+1 + " ");  //prints * * * * *
            }
            System.out.print("\n");
        }

        /*
         for(int i=1;i<=rows;i++){
            for(int j=1;j<=n-1+1;j++){
                System.out.print(j + " ");  //prints * * * * *
            }
            System.out.print("\n");
        }

         */

        sc.close();
        
    }
    
}


