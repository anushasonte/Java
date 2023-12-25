package Patterns;
import java.util.*;

public class HollowRhombus {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();


        for(int i=1;i<=rows;i++){
            //to print spaces
            int spaces = rows-i;
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            } 
            
            //to print stars
            for(int j=1;j<=rows;j++){
                if(i==1 | i== rows | j==1 | j==rows)
                System.out.print("* ");
                else
                System.out.print("  ");
            }  
           //print in next line
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}

