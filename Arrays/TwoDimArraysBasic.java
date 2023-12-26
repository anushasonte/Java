package Arrays;
import java.util.Scanner;

//Notes
/*
 Like a Matrix! Consists of rows and columns. Indexing starts from 0 for both rows and cols.
 Syntax:
 datatype arrayName[][] = new datatype [rowSize][colSize];
*/

public class TwoDimArraysBasic {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int numRows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int numCols = sc.nextInt();

        int twoDArray[][] = new int[numRows][numCols];

        //Storing elements
        for(int i=0;i<numRows;i++)
        {
            System.out.println("Enter elements for row "+(i+1) + " :");
            for(int j=0;j<numCols;j++)
            {
                System.out.println("Enter number: "+(j+1)+ " :");
                int cellVal = sc.nextInt();
                twoDArray[i][j] = cellVal;
                
            }
        }

         //Printing cells
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<numCols;j++)
            {
                System.out.print(twoDArray[i][j] + " ");   
                
            }
             System.out.println(); 
        }


        sc.close();
    }
    
}
