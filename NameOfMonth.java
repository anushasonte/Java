/* Ask the user to enter the number of the month & print the name of the month. 
For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on. */

import java.util.*;
public class NameOfMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month number: ");
        int numOfMonth = sc.nextInt();
        String result;

        switch(numOfMonth){
            case 1 :result = "January";
                    break;
            case 2: result = "February";
                    break;
            case 3: result = "March";
                    break;
            case 4: result = "April";
                    break;
            case 5: result = "May";
                    break;
            case 6: result = "June";
                    break;
            case 7: result = "July";
                    break;
            case 8: result = "August";
                    break;
            case 9: result = "September";
                    break;
            case 10: result = "October";
                    break;
            case 11: result = "November";
                    break;
            case 12: result = "December";
                    break;
            default: {
                    result = null;
                    System.out.println("Invalid choice!");
                  } 
        }

        System.out.println("Entered month: "+result);

        sc.close();


    }
    
}
