package Recursion;
import java.util.Scanner;

//Every character has a choice whether to appear or not in the subsequence.
//All characters can appear and all characters might not appear.
//But if they appear, they must be in same order as that of input.
//For input string = abc => abc, ab, bc, ac, a, b, c

/*
Time complexity: O(2^n)
in the form of a free -> each node represents a function call
Last level of the tree -> leaves - represent all subsequences
if input = abc, length (n) = 3, each a,b,c has two choices whether to appear or not = 2*2*2 = 8 = 2 pow n
*/

/* Problem: 
If input = aaa,
output = 
aaa
aaa
aa
aa
a
aa
a
a
Solution: PrintAllUniqueSubSequences.java
*/

public class PrintAllSubSequences {

    public static void printsubsequence(String input, String newString, int index){
        if(index == input.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = input.charAt(index);
        printsubsequence(input, newString+currentChar, index+1); //String appears in new string
        printsubsequence(input, newString, index+1); //String does not appear in new string
        //any empty space is also a subsequence because all characters can choose not to appear

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.next();
        printsubsequence(input, "",0);
        sc.close();
    }
    
}
