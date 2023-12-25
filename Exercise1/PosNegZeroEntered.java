//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, 
//negative and zeros entered. 

package Exercise1;
import java.util.*;
public class PosNegZeroEntered {

    public static void main(String[] args) {

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        Scanner sc = new Scanner(System.in);

        int choice = 1;

        do{
        System.out.println("Press 1 to continue or 0 to stop: ");
        choice = sc.nextInt();

        if(choice == 0)
        break;

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        
        if(num>0)
        positiveCount++;
        else if (num == 0)
        zeroCount ++;
        else
        negativeCount++;
        }while(choice==1);

        System.out.println("Number of positve numbers entered: "+positiveCount);
        System.out.println("Number of negative numbers entered: "+negativeCount);
        System.out.println("Number of zeroes entered: "+zeroCount);

        sc.close();
    }
    
}
