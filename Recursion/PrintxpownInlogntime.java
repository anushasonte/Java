package Recursion;
//Stack height = log n //number of levels/function calls in stack without main
/*
x pow n = x pow n/2 * x pow n/2 (for n=even)
x pow n = x pow n/2 * x pow n/2  * x (for n=odd)

calculatePower(x= 5, n= 0) -> return 1
calculatePower(x= 5, n= 1) -> xpownb2 = calculatePower(x= 5, n= 0) -> While returning, n = odd => result = 1 * 1 * 5 = 5
calculatePower(x= 5, n= 2) -> xpownb2 = calculatePower(x= 5, n= 1) -> While returning, n = even => result = 5 * 5 = 25 
calculatePower(x= 5, n= 4) -> xpownb2 = calculatePower(x= 5, n= 2) -> While returning, n = even => result = 25 * 25 = 625  
main() -> calculatePower(x= 5, n= 4) -> prints 625

Height of tree = 4
*/

public class PrintxpownInlogntime {

    public static int calculatePower(int x, int n){
        if(n==0){  //BASE CASE 1
            return 1;
        }
        if(x==0){ //Base case 2
            return 0;
        }

        int xpownb2 = calculatePower(x,n/2);
        //if n is even
        if(n%2 == 0){  
            int result = xpownb2 * xpownb2;
            return result;
        }
        else{ //if n is odd
            int result = x * xpownb2 * xpownb2;
            return result;
        }
    }



    public static void main(String[] args) {
        int result = calculatePower(5, 4);
        System.out.println(result);
    }
    
}
