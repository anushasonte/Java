package Patterns;
import java.util.*;

public class SolidRectange {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

    System.out.println("Enter number of columns:");
    int cols = sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                System.out.print("* ");  //prints * * * * *
            }
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}
