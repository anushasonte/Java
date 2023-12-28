/*
Input : Unsorted array
Output : sorted array (usually ascending)
Run loop (n-1) times
Logic: Iterative version
Divides array into two parts: sorted and unsorted

Example: Input : 7, 8, 3, 1, 2





Time complexity:
Outer loop : (n-1) times
Inner loop : n times
Time complexity: O(n^2)  //not good
Space complexity: O(1) //only the temp var used for swapping
*/ 


package Sorting;
import java.util.*;

public class InsertionSort {

    public static int[] sortUsingInsertionSort(int insertionSort[]){
        int afterSort[] = insertionSort;

        for(int i = 1; i< afterSort.length; i++){ //initial unsorted part
            int current = afterSort[i]; //stores the current element
            int j=i-1;
            while (j>=0 && current < afterSort[j]){
                afterSort[j+1] = afterSort[j];
                j--;
            }
            afterSort[j+1] = current;

        }
        return afterSort;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();

        int insertionSort[] = new int[size];
        int afterSort[] = new int[size];

        for(int i =0; i< insertionSort.length; i++){
            System.out.println("Enter element "+ (i+1) + " :");
            insertionSort[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for(int i =0; i< insertionSort.length; i++){
            System.out.print(insertionSort[i] + " ");
        }
        System.out.println();

        afterSort = sortUsingInsertionSort(insertionSort);
        
        System.out.println("After Sorting: ");
        for(int i =0; i< afterSort.length; i++){
            System.out.print(afterSort[i] + " ");
        }


        sc.close();
    }
    
}

