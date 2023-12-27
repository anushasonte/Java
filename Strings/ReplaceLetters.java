//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ 
//in the original string with letter ‘i’. 
//Example : 
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”


package Strings;
import java.util.*;

public class ReplaceLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string: ");
        String input = sc.next();

        String replacedString = input.replaceAll("e","i");

        System.out.println("After replacing e with i: "+replacedString);

        //Without using replaceAll
        String replacedString1 = "";

        for(int i=0; i<input.length();i++) {
            if(input.charAt(i) == 'e') {
               replacedString1 = replacedString1 + "i";
            }
            else{
                replacedString1 = replacedString1 + input.charAt(i);
            }
        }

        System.out.println("After replacing e with i without using replaceAll: "+replacedString1);

        sc.close();
    }
    
}
