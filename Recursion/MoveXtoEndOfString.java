package Recursion;
import java.util.*;

/*
 Time complexity: n times movextoend() call + count times append in base case (max count = n)
 O(n + n ) = O(2n) = O(n)
 */

public class MoveXtoEndOfString {


    public static void movextoend(String input,int index, StringBuilder newString, int countofx){
        int length = input.length();
        if(index == length){ //Base condition
            for(int i=0;i<countofx;i++){
                newString.append('x');
            }
            System.out.println(newString);
            return;
        }

        char currentChar = input.charAt(index);
        if(currentChar == 'x'){
            countofx ++;
        }
        else{
            newString.append(currentChar);
        }
        movextoend(input, index+1, newString, countofx);

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.next();
        movextoend(input,0,new StringBuilder(),0);
        sc.close();

    }
    
}
