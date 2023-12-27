package Strings;
import java.util.*;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = sc.next();

        System.out.println("Enter last name: ");
        String lastName = sc.next();

        String fullName = firstName + " "+ lastName;
        
        //String length
        int length = fullName.length();

        System.out.println(fullName);
        System.out.println("Length of string is: "+length);

        sc.close();
        
    }

    
}
