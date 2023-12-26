package Arrays;
import java.util.Scanner;


public class Transpose {

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

        //Printing transpose
        System.out.println("Given size of the matrix is: "+numRows +"X" + numCols);
        System.out.println("New size of the matrix is: "+numCols +"X" + numRows);
        for(int i=0;i<numCols;i++)
        {
            for(int j=0;j<numRows;j++)
            { 

              System.out.print(twoDArray[j][i] + " ");   
            }
             System.out.println();  
        }


        sc.close();
    }
    
}


