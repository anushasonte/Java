package Patterns;
import java.util.*;

public class ChristmasTree {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter height of the tree: ");
    int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            //for spaces
            for(int j=1; j<= rows-i;j++){    
                System.out.print(" ");
            }

            //for star
            for(int j=1;j<=i;j++){
                System.out.print("* ");  
            }
            System.out.print("\n");
        }

        //to print the base
        int baselimit = rows/3;
        for(int i=1;i<=baselimit;i++){
            //for spaces
            for(int j=1; j<= rows-i;j++){    
                System.out.print(" ");
            }

            //for number
            for(int j=1;j<=i;j++){
                System.out.print("^ ");  
            }
            System.out.print("\n");
        }


        sc.close();
        
    }
    
}



