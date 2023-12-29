package Recursion;
import java.util.*;

public class PrintStringInReverse {

    public static void reverseString(String input, int index){
        if(index == 0){
            System.out.print(input.charAt(index));
            return;
        }
        System.out.print(input.charAt(index));
        reverseString(input, index-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.next();
        reverseString(input, input.length()-1);
        sc.close();
    }
    
}
