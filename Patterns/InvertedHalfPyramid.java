package Patterns;
import java.util.*;

public class InvertedHalfPyramid {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");  //prints * * * * *
            }
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}

