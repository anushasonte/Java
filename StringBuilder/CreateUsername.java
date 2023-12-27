/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. 
Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”

 */
package StringBuilder;
import java.util.*;

public class CreateUsername {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email address: ");
        String email = sc.next();

        StringBuilder username = new StringBuilder(email);

        int endIndex = 0;

        for(int i=0; i<username.length();i++)
        {
            if(username.charAt(i) == '@')
            {
            endIndex = i;
            break;
            }
        }

        System.out.println("End index: "+endIndex);

        String user = username.substring(0,12);

        System.out.println("Username: "+user);


        sc.close();
    }
    
}
