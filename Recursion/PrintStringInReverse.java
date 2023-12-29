package Recursion;
/*
 Time complexity: 
 O(n) -> number of insertions in stack = length of input string 

Stack:
input: anusha

reverseString("anusha",0) : prints "a" : return
reverseString("anusha",1) : prints "n" : reverseString("anusha",0) : return 
reverseString("anusha",2) : prints "u" : reverseString("anusha",1) : return
reverseString("anusha",3) : prints "s" : reverseString("anusha",2) : return
reverseString("anusha",4) : prints "h" : reverseString("anusha",3) : return
reverseString("anusha",5) : prints "a" : reverseString("anusha",4) : return
main(): reverseString("anusha",5) : returns ahsuna
*/
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
