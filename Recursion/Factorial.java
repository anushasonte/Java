package Recursion;
/*
Memory stack:

calculateFactorial(n=1) ; return 1;
calculateFactorial(n=2) ; factorialOfnminus1 = calculateFactorial(n=1) ; factorialOfn = 2 * 1 = 2
calculateFactorial(n=3) ; factorialOfnminus1 = calculateFactorial(n=2) ; factorialOfn = 3 * 2 = 6
calculateFactorial(n=4) ; factorialOfnminus1 = calculateFactorial(n=3) ; factorialOfn = 4 * 6 = 24
calculateFactorial(n=5) ; factorialOfnminus1 = calculateFactorial(n=4) ; factorialOfn = 5 * 24 = 120
main() -> n= 5 => factorial = 120

*/

public class Factorial {

    public static int calculateFactorial (int n){
        if(n==1 || n==0){
            return 1;
        }
        int factorialOfnminus1 = calculateFactorial(n-1);
        int factorialOfn = n * factorialOfnminus1;
        return factorialOfn;

    }



    public static void main(String[] args) {
        int factorial = calculateFactorial(5);
        System.out.println(factorial);
        
    }
    
}
