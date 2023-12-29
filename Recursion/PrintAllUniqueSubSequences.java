package Recursion;
import java.util.*;

/*
Using hashset -> stores only unqiue elements
//Declaration
HashSet <Datatype> nameOfHashSet = new HashSet<>();
*/

public class PrintAllUniqueSubSequences {

    public static void printUniqueSubSequence(String input, String newString, int index, HashSet<String> set){
        if(index == input.length()){
            if(set.contains(newString)){
            return;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        char currentChar = input.charAt(index);
        printUniqueSubSequence(input, newString+currentChar, index+1,set); //String appears in new string
        printUniqueSubSequence(input, newString, index+1,set); //String does not appear in new string
        //any empty space is also a subsequence because all characters can choose not to appear

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.next();
        HashSet <String> subSequences = new HashSet<>();
        printUniqueSubSequence(input, "",0, subSequences);
        sc.close();
    }
    
}
