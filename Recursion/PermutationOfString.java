package Recursion;

import java.util.Scanner;

/*
Time complexity: O(n!) -> bad!
for n length input string = (n!) (n-1)! ---

 
*/

public class PermutationOfString {

    public static void printPermutations(String input, String permutation){

        if(input.length() == 0){ //base condition
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<input.length(); i++){
            char currentChar = input.charAt(i);
            //pass the rest of the string ex: abc and current char = b
            // new string = a + c = ac
            String newString = input.substring(0, i) + input.substring(i+1);
            printPermutations(newString, permutation+currentChar);
        }
    }



     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.next();
        printPermutations(input,"");
        sc.close();
    }
    
}
