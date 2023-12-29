package Recursion;
import java.util.*;

public class RemoveDuplicatesInString {

    public static void removeDuplicates(String input, String result, int index){
        if(index == input.length()){
            System.out.println(result);
            return;
        }
        char currentChar = input.charAt(index);
        if(result.indexOf(currentChar) == -1){
            result += currentChar;
        }

        removeDuplicates(input, result, index+1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.next();
        removeDuplicates(input,"",0);
        sc.close();
    }
    
}
