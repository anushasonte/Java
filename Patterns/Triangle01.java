package Patterns;
import java.util.*;

public class Triangle01 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j) % 2 == 0) //even sum
                System.out.print(1 + " ");  
                else //odd sum
                System.out.print(0 + " ");
                
            }
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}



