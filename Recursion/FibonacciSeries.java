package Recursion;

/*
Memory Stack:
printFibonacciSeries(3, 5, 0) -> return
printFibonacciSeries(3, 5, 1) -> nextTerm = 8 ; print 8 //nothing to do after recurisve call while returning
printFibonacciSeries(2, 3, 2) -> nextTerm = 5 ; print 5 //nothing to do after recurisve call while returning
printFibonacciSeries(1, 2, 3) -> nextTerm = 3 ; print 3 //nothing to do after recurisve call while returning
printFibonacciSeries(1, 1, 4) -> nextTerm = 2 ; print 2 //nothing to do after recurisve call while returning
printFibonacciSeries(0, 1, 5) -> nextTerm = 1 ; print 1 //nothing to do after recurisve call while returning
main() -> prints 0, 1 -> n= 7 ; printFibonacciSeries(0, 1, 5) 
Output: 0 1 1 2 3 5 8
*/

public class FibonacciSeries {

    public static void printFibonacciSeries(int f0, int f1, int n){
        if(n == 0){
            return;
        }
        int nextTerm = f0+f1;
        System.out.print(nextTerm + " ");
        printFibonacciSeries(f1, nextTerm, n-1);
    }


    public static void main(String[] args) {
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        int n=7;
        printFibonacciSeries(0, 1, n-2);
    }
    
}
