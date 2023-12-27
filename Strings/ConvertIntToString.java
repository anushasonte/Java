package Strings;
import java.util.*;

public class ConvertIntToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Int to String
        System.out.println("Enter int: ");
        int input = sc.nextInt(); 
        
        String output = Integer.toString(input);
        System.out.println("Converted int to string: " +output);


        //String to int
        System.out.println("Enter string: ");
        String in = sc.next();
        int out = Integer.parseInt(in);
        System.out.println("Converted string to int: " +out);


        sc.close();
        
    }

    
}


