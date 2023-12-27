package StringBuilder;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string: ");
        String input = sc.next();

        for(int i= input.length()-1; i>=0; i--)
        {
            System.out.print(input.charAt(i));
        }
        System.out.println();


        sc.close();
    }
    
}
