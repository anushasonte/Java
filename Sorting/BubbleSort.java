/*
Input : Unsorted array
Output : sorted array (usually ascending)
Run loop (n-1) times
(N-1) pairwise comparisions and swaps

Example: Input : 7, 8, 3, 1, 2
Here n = 5
n = 1: 
7, 3, 8, 1, 2
7, 3, 1, 8, 2
7, 3, 1, 2, 8 //largest element at the end

n = 2: //ignores last num as it is already sorted
3, 7, 1, 2, 8
3, 1, 7, 2, 8
3, 1, 2, 7, 8 //second largest element at the end

n = 3: //ignores last two num
1, 3, 2, 7, 8
1, 2, 3, 7, 8 //Third largest element at the end

n = 4:
1, 2, 3, 7, 8 //Fourth largest element at the end


Time complexity:
Outer loop : (n-1) times
Inner loop : (n-1) times
Time complexity: O(n^2)  //not good
Space complexity: O(1) //only the temp var used for swapping
*/ 


package Sorting;
import java.util.*;

public class BubbleSort {

    public static void swapNumbers(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] sortUsingBubbleSort(int bubbleSort[]){
        int afterSort[] = bubbleSort;

        for(int i = 0; i< afterSort.length-1; i++){ //N-1 iterations
            for(int j=0; j< afterSort.length-1-i; j++){ //ignore last elements at the end
                  if(afterSort[j] > afterSort[j+1]){
                    swapNumbers(afterSort, j, j+1);
                  }
            }

        }
        return afterSort;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();

        int bubbleSort[] = new int[size];
        int afterSort[] = new int[size];

        for(int i =0; i< bubbleSort.length; i++){
            System.out.println("Enter element "+ (i+1) + " :");
            bubbleSort[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for(int i =0; i< bubbleSort.length; i++){
            System.out.print(bubbleSort[i] + " ");
        }
        System.out.println();

        afterSort = sortUsingBubbleSort(bubbleSort);
        
        System.out.println("After Sorting: ");
        for(int i =0; i< afterSort.length; i++){
            System.out.print(afterSort[i] + " ");
        }


        sc.close();
    }
    
}
