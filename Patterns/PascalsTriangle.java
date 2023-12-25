package Patterns;
import java.util.*;

public class PascalsTriangle {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

        for(int i=0;i<rows;i++){
            //for spaces
            for(int j=1; j<= rows-i;j++){    
                System.out.print(" ");
            }
            //for number
            int number=1;
            for(int j=0;j<=i;j++){
                System.out.print(number + " ");  
                number = number * (i - j) / (j + 1);
            } 
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}





