/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. 
Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”

 */
package Strings;
import java.util.*;

public class CreateUsername {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email address: ");
        String email = sc.next();

        int endIndex = 0;

        for(int i=0; i<email.length();i++)
        {
            if(email.charAt(i) == '@')
            {
            endIndex = i;
            break;
            }
        }

        System.out.println("Begin index: "+endIndex);

        String username = email.substring(0,endIndex);

        System.out.println("Username: "+username);


        sc.close();
    }
    
}
