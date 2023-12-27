//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
package Strings;
import java.util.*;

public class ArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings: ");
        int size = sc.nextInt();
        int cumulativeLength = 0;

        String []input = new String[size];

        for(int i = 0; i< size; i++)
        {
            System.out.println("Enter String: "+(i+1));
            input[i] = sc.next();
            cumulativeLength = cumulativeLength + input[i].length();
        }

        System.out.println("Cumulative length of all strings is: "+cumulativeLength);

        sc.close();
    }
    
}
