package Recursion;
import java.util.*;

/*
Question:
0 -> .
1 -> abc
2 -> def
3 -> ghi
4 -> jkl
5 -> mno
6 -> pqrs
7 -> tu
8 -> vwx
9 -> yz

Input : 23
2: def
3: ghi

Ouput: dg, dh, di, eg, eh, ei, fg, fh, fi

Stack:

printCombinations("23", 2, "fi") -> prints fi ; return
printCombinations("23", 2, "fh") -> prints fh ; return
printCombinations("23", 2, "fg") -> prints fg ; return
printCombinations("23", 2, "ei") -> prints ei ; return
printCombinations("23", 2, "eh") -> prints eh ; return
printCombinations("23", 2, "eg") -> prints eg ; return
printCombinations("23", 2, "di") -> prints di ; return
printCombinations("23", 2, "dh") -> prints dh ; return
printCombinations("23", 2, "dg") -> prints dg ; return
printCombinations("23", 1, "f") -> currentchar = 3 , mapping = "ghi" -> printCombinations("23", 2, "fg"),printCombinations("23", 1, "fh"), printCombinations("23", 1, "fi") ; return
printCombinations("23", 1, "e") -> currentchar = 3 , mapping = "ghi" -> printCombinations("23", 2, "eg"),printCombinations("23", 1, "eh"), printCombinations("23", 1, "ei") ; return
printCombinations("23", 1, "d") -> currentchar = 3 , mapping = "ghi" -> printCombinations("23", 2, "dg"),printCombinations("23", 1, "dh"), printCombinations("23", 1, "di") ; return
printCombinations("23", 0, "") -> currentchar = 2 , mapping = "def" -> printCombinations("23", 1, "d"),printCombinations("23", 1, "e"), printCombinations("23", 1, "f") ; return
main() -> printCombinations("23", 0, ""); returns;

*/


public class PrintKeypadCombiantions {

    public static String[] keypad = {".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

       public static void printCombinations(String input,int index, String combination){
        if(index == input.length()){
            System.out.println(combination);
            return;
        }
        char currentChar = input.charAt(index);
        String mapping = keypad[currentChar - '0']; //get mapping for the entered number

        for(int i=0;i<mapping.length();i++){ //iterate through the characters present in the mapping
            printCombinations(input, index+1, combination+mapping.charAt(i));
        }

       }



        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.next();
        printCombinations(input, 0, "");
        sc.close();
    }
    
}
