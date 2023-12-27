package Strings;
import java.util.*;

public class SubStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = sc.next();

        System.out.println("Enter last name: ");
        String lastName = sc.next();
        
        String fullName = firstName + " "+ lastName;
        
        String subString = fullName.substring(2);
        System.out.println("Sub string with beginning index as 2: "+subString);

        String subString1 = fullName.substring(2,7);
        System.out.println("Sub string with beginning index as 2 and end index as 7: "+subString1);
        //end index is not included so in the above: 2,3,4,5,6 characters will be printed

        sc.close();
        
    }

    
}

