package Recursion;

/*
In stack:
calculateSum() start: 5, end: 5 //Base case  sum: 15 // prints 15
calculateSum() start: 4, end: 5, sum: 10 //prints start value = 4
calculateSum() start: 3, end: 5, sum: 6 //prints start value = 3
calculateSum() start: 2, end: 5, sum: 3 //prints start value = 2
calculateSum() start: 1, end: 5, sum: 1 //prints start value = 1
main() start: 1, end: 5, sum: 0 //ends
 
*/

public class SumOfFirstNNaturalNumbers {

    public static void calculateSum(int start, int end, int sum) {
        if(start==end){
            sum = sum + start;
            System.out.println(sum);
            return;
        }
        sum = sum + start;
        calculateSum(start+1, end, sum);
        System.out.println(start);

    }

    public static void main(String[] args) {
        calculateSum(1, 5, 0);
        
    }
    
}
