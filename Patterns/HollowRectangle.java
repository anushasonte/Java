package Patterns;
import java.util.*;

//Will be empty in between
//Analyze all pattern problems in the form of matrx
//The job of rows is done by outer for loop, the job of columns is done by inner for loop.

public class HollowRectangle {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

    System.out.println("Enter number of columns:");
    int cols = sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                //cell (i,j)
                if(i==1 || j==1 || i==rows || j==cols)
                System.out.print("* ");  //prints * * * * *
                else
                 System.out.print("  ");

            }
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}

