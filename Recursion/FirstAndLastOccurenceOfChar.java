package Recursion;
import java.util.*;

/*
Time complexity: O(n+1) = O(n) //string length

trackOccurence("abaaca",'a',6) -> base conditon met -> return
trackOccurence("abaaca",'a',5) -> currentChar = 'a' ; first = 0, last = 4 ; trackOccurence("abaaca",'a',6) -> return;
trackOccurence("abaaca",'a',4) -> currentChar = 'c' ; first = 0, last = 3 ; trackOccurence("abaaca",'a',5) -> return;
trackOccurence("abaaca",'a',3) -> currentChar = 'a' ; first = 0, last = 3 ; trackOccurence("abaaca",'a',4) -> return;
trackOccurence("abaaca",'a',2) -> currentChar = 'a' ; first = 0, last = 2 ; trackOccurence("abaaca",'a',3) -> return;
trackOccurence("abaaca",'a',1) -> currentChar = 'b' ; first = 0, last = -1 ; trackOccurence("abaaca",'a',2) -> return;
trackOccurence("abaaca",'a',0) -> currentChar = 'a' ; first = 0, last = -1 ; trackOccurence("abaaca",'a',1) -> return;
main() -> trackOccurence("abaaca",'a',0); first = -1, last = -1 ; -> return first = 0, last =4
*/

public class FirstAndLastOccurenceOfChar {

    //Declaring static variables, the value of static varaibles will be preserved during each recursion call.
    public static int first = -1;
    public static int last = -1;

    public static void trackOccurence(String input, char charToSearch, int index){
        //Base condition
        if(index == input.length()){
            return;
        }

        char currentChar = input.charAt(index);
        if(currentChar == charToSearch){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }

        trackOccurence(input,charToSearch,index+1);
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string: ");
        String input = sc.next();
        System.out.println("Enter char to search: ");
        char charToSearch = sc.next().charAt(0); //to take character input from user
        trackOccurence(input,charToSearch,0);
        System.out.println("First occurence: "+first);
        System.out.println("Last occurence: "+last);
        sc.close();
    }
    
}
