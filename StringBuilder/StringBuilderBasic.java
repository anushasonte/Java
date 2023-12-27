package StringBuilder;
import java.util.Scanner;

/*
Strings are immutable in java. Every operation on exisiting string which changes the string will result in creation of new string.
Strings are stored in string pool in heap memory.
Variables are stored in stack and they point to string obj in heap memory.
StringBuilder is mutable. Same string is updated each time. String builder objects are also stored in heap memory.
*/

public class StringBuilderBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaration
        StringBuilder sb = new StringBuilder("Mary");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        //insert a new char at the beginning
        sb.insert(0,'S');
        System.out.println(sb);

        //delete a char 
        sb.delete(0, 1);
        System.out.println(sb);

        //insert a new char in the middle
        sb.insert(2,'r');
        System.out.println(sb);

        //delete a char 
        sb.delete(2, 4); //end char is not included.
        System.out.println(sb);

        //append 
        sb.append(" ");
        sb.append("month ");
        sb.append("is ");
        sb.append("hot ");
        System.out.println(sb);

        //length of string builder
        System.out.println(sb.length());
        
        sc.close();
    }
    
}
