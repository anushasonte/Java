package Arrays;
import java.util.Scanner;


public class FindElementInTwoDArray {

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

        System.out.println("Enter key to find: ");
        int key = sc.nextInt();

         //Printing cells
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<numCols;j++)
            {
                if(twoDArray[i][j] == key)
                //System.out.println("Given key " + key + " found at the cell: [" +i+ "][" + j + "]" ); 
                System.out.println("Given key " + key + " found at location: (" +i+ "," + (j+1) + ")" );   
                
            }
        }


        sc.close();
    }
    
}

