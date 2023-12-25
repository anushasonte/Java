package Patterns;
import java.util.*;

public class Diamond {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            //print spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");  
            }
            //print star
            int numstars = (2*i) -1;
            for(int j=1;j<=numstars;j++){
                System.out.print("* "); 
            }
            System.out.print("\n");
        }

        for(int i=rows-1;i>=1;i--){
            //print spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");  
            }
            //print star
            int numstars = (2*i) -1;
            for(int j=1;j<=numstars;j++){
                System.out.print("* "); 
            }
            System.out.print("\n");
        }

        sc.close();
        
    }
    
}

