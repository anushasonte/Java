package Arrays;
import java.util.Scanner;


public class PrintSpiralOrder {

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

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = numRows-1;
        int colEnd = numCols-1;

         //Printing spiral order
        System.out.println("The Spiral order of the matrix is: ");

        while(rowStart <=rowEnd && colStart<=colEnd){
        for(int i=colStart; i<=colEnd; i++)
        {
            System.out.print(twoDArray[rowStart][i] + " ");
        }
        rowStart++;

        for(int i=rowStart; i<=rowEnd; i++)
        {
            System.out.print(twoDArray[i][colEnd] + " ");
        }
        colEnd--;

        for(int i=colEnd; i>=colStart; i--)
        {
            System.out.print(twoDArray[rowEnd][i]+ " ");
        }
        rowEnd--;

        for(int i=rowEnd; i>=rowStart; i--)
        {
            System.out.print(twoDArray[i][colStart]+ " ");
        }
        colStart++;

    }


        sc.close();
    }
    
}


