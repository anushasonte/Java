package Recursion;
import java.util.*;

/*
Time complexity: O(n) -> size of array

Sorted case:

checkIfSorted([1,2,3,4,5], 4) : base condition met: return true
checkIfSorted([1,2,3,4,5], 3) : 4 < 5 : checkIfSorted([1,2,3,4,5], 4) ; return
checkIfSorted([1,2,3,4,5], 2) : 3 < 4 : checkIfSorted([1,2,3,4,5], 3) ; return
checkIfSorted([1,2,3,4,5], 1) : 2 < 3 : checkIfSorted([1,2,3,4,5], 2) ; return
checkIfSorted([1,2,3,4,5], 0) : 1 < 2 : checkIfSorted([1,2,3,4,5], 1) ; return
main() -> checkIfSorted([1,2,3,4,5], 0) -> print sorted

UnSorted case:


checkIfSorted([1,2,4,3,5], 2) : 4 < 3 : return false
checkIfSorted([1,2,4,3,5], 1) : 2 < 3 : checkIfSorted([1,2,3,4,5], 2) ; return
checkIfSorted([1,2,4,3,5], 0) : 1 < 2 : checkIfSorted([1,2,3,4,5], 1) ; return
main() -> checkIfSorted([1,2,4,3,5], 0) -> print unsorted
*/

public class CheckIfArrayIsSorted {

    public static boolean checkIfSorted(int input[],int i){
        
        if(i==input.length-1){
            return true;
        }

        if(input[i] >= input[i+1]){
            return false;
        }
        else{
            return checkIfSorted(input, i+1);
        }
       
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int inputArray[] = new int[size];
        for(int i = 0; i< inputArray.length;i++){
            System.out.println("Enter element: "+(i+1));
            inputArray[i] = sc.nextInt();
        }

        boolean isSorted = checkIfSorted(inputArray,0);

        if(isSorted){
            System.out.println("Given array is sorted");
        }
        else{
            System.out.println("Given array is not sorted");
        }

        sc.close();
    }
    
}
