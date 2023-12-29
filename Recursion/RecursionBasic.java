package Recursion;

/*
Recursion: A function that calls itself.
Inner functions will do some work and give output to outer functions.
Recursive calls will be repeated until base case is reached.
All recursive calls are stored in a stack. 
All variables used in recursion will be created in each level of stack during recursive calls. 
Iteration-> only one variable is created
So, without base case, recursive calls will be infinite -> results in Stack Overflow.

Statements before the recursive call are executed during insertion of recursive call on stack, whereas statements 
after recursive call are executed while moving back in stack after base case condition is satisfied. 

For below program in stack memory:

printNumbers(n=0) -> Base case failed, return 
printNumbers(n=1) -> Prints n=1
printNumbers(n=2) -> Prints n=2
printNumbers(n=3) -> Prints n=3
printNumbers(n=4) -> Prints n=4
printNumbers(n=5) -> Prints n=5
main() n = 5 returns!
*/

public class RecursionBasic {

    public static void printNumbers(int n){
        if(n==0){ //base case
            return; 
        }
        printNumbers(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        //Using iteration
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("-----------");

        //Using recursion
        printNumbers(5);
        
    }
    
}
