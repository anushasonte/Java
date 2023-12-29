package Recursion;
//Stack height = n //number of levels/function calls in stack without main

/*
calculatePower(x= 5, n= 0) -> return 1 
calculatePower(x= 5, n= 1) -> xpownm1 = calculatePower(x= 5, n= 0) -> While returning, result = 5 * 1 = 5 
calculatePower(x= 5, n= 2) -> xpownm1 = calculatePower(x= 5, n= 1) -> While returning, result = 5 * 5 = 25 
calculatePower(x= 5, n= 3) -> xpownm1 = calculatePower(x= 5, n= 2) -> While returning, result = 5 * 25 = 125 
main() -> calculatePower(x= 5, n= 3) -> prints 125

Height of tree = 4
*/

public class Printxpown {

    public static int calculatePower(int x, int n){
        if(n==0){  //BASE CASE 1
            return 1;
        }
        if(x==0){ //Base case 2
            return 0;
        }
        int xpownm1 = calculatePower(x,n-1);
        int result = x * xpownm1;
        return result;
    }



    public static void main(String[] args) {
        int result = calculatePower(5, 4);
        System.out.println(result);
    }
    
}
