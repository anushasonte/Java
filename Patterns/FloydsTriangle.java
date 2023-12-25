package Patterns;
import java.util.*;

public class FloydsTriangle {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();
    int counter=1;

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");  //prints * * * * *
                counter++;
            }
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}


