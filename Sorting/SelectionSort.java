/*
Input : Unsorted array
Output : sorted array (usually ascending)
Run loop (n-1) times
in each iteration, find the smallest element and place it in the beginning
for the next iteration, ignore the first element and find the second smallest element and place it in the second position etc.

Example: Input : 7, 8, 3, 1, 2

n=1: start with i=0
smallest = 7 (assume) index = 0;
compare 7 with 8: 7, 8, 3, 1, 2 : no change
compare 7 with 3: smallest = 3 ; index = 2;
7, 8, 3, 1, 2
compare 3 with 1: smallest = 1 ; index = 3
swap the smallest element with first position
1, 8, 3, 7, 2

n=2: start with i=1
smallest = 8
1, 8, 3, 7, 2
compare 8 with 3: smallest = 3 (index = 2)
1, 8, 3, 7, 2
compare 3 with 2: smallest = 2 (index = 3)
swap the smallest element with second position
1, 2, 3, 7, 8

n=3: start with i=2
smallest = 3
comapre 3 with 7
compare 3 with 8
no swap 

n= 4: start with i=3
smallest : 7
compare with 8 : no swap



Time complexity:
Outer loop : (n-1) times
Inner loop : n times
Time complexity: O(n^2)  //not good
Space complexity: O(1) //only the temp var used for swapping
*/ 


package Sorting;
import java.util.*;

public class SelectionSort {

    public static void swapNumbers(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] sortUsingSelectionSort(int selectionSort[]){
        int afterSort[] = selectionSort;

        for(int i = 0; i< afterSort.length-1; i++){ //N-1 iterations
            int smallest = i; //stores the index of smallest element
            for(int j=i+1; j< afterSort.length; j++){  //starts from i position as first elements will be sorted
                  if(afterSort[smallest] > afterSort[j]){
                    smallest = j;
                  }
            }
            swapNumbers(afterSort, smallest, i);

        }
        return afterSort;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();

        int selectionSort[] = new int[size];
        int afterSort[] = new int[size];

        for(int i =0; i< selectionSort.length; i++){
            System.out.println("Enter element "+ (i+1) + " :");
            selectionSort[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for(int i =0; i< selectionSort.length; i++){
            System.out.print(selectionSort[i] + " ");
        }
        System.out.println();

        afterSort = sortUsingSelectionSort(selectionSort);
        
        System.out.println("After Sorting: ");
        for(int i =0; i< afterSort.length; i++){
            System.out.print(afterSort[i] + " ");
        }


        sc.close();
    }
    
}

