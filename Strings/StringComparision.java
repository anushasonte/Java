package Strings;
import java.util.*;

public class StringComparision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String string1 = sc.next();

        System.out.println("Enter string 2: ");
        String string2 = sc.next();

        //Compare using == operator
        if(string1 == string2)
        System.out.println("Using == operator: Strings are equal");
        else
        System.out.println("Using == operator: Strings are not equal");

        //Compare using equals
        if(string1.equals(string2))
        System.out.println("Using equals operator: Strings are equal");
        else
        System.out.println("Using equals operator: Strings are not equal");

        
        int output = string1.compareTo(string2);

        // if s1 > s2 : returns positive integer
        // if s1 = s2 : returns 0
        // if s1 < s2 : returns negative integer

        if(output == 0)
        System.out.println("Using compareTo: Both strings are equal!");
        else
        System.out.println("Using compareTo: Strings are not equal!");

        sc.close();
        
    }

    
}


