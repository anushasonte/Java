package Strings;
import java.util.*;

public class StringCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = sc.next();

        System.out.println("Enter last name: ");
        String lastName = sc.next();
        
        //String concatenation
        String fullName = firstName + " "+ lastName;
        
        //String length
        int length = fullName.length();
 
        for(int i=0;i<length;i++)
        {
            System.out.println(fullName.charAt(i)); //prints charater present at that index
        }

        sc.close();
        
    }

    
}

