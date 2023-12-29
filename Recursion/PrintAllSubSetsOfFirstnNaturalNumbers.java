package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/*
Time complexity = O(2^n)
//as each element has the choice whether to appear or not.

if n=3 => {1,2,3}
subsets: {1,2,3}, {1,3} {2,3} {1,2} {1} {2} {3} {}

Use: Arraylist

Declaration:
ArrayList<Datatype> arrayListName = new ArrayList<>();

Usage:
arrayListName.size() -> gives size of arraylist
arrayListName.get(index) -> returns element present at the given index.

//cannot print directly, use iteration.
 
*/

public class PrintAllSubSetsOfFirstnNaturalNumbers {

    public static void printsubset(ArrayList<Integer> subset) {
        for(int i=0; i< subset.size(); i++){
            System.out.print(subset.get(i)+ " ");
        }
         System.out.println();
    }


    public static void printSubsets(int n, ArrayList<Integer> subset){

        if(n==0){
            printsubset(subset);
            return;
        }

        //if element is added
        subset.add(n);
        printSubsets(n-1, subset);

        //if element is not added
        subset.remove(subset.size()-1);
        printSubsets(n-1, subset);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input n: ");
        int n = sc.nextInt();
        ArrayList<Integer> subsets = new ArrayList<>();
        printSubsets(n,subsets);
        sc.close();
        
    }
    
}
