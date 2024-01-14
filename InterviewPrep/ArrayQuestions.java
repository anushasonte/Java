package InterviewPrep;

import java.util.ArrayList;

public class ArrayQuestions {

    public static void main(String[] args) {

        int arr[] = new int[10]; //Declaration - fixed size, stores primtives, objects. ; only similar data!
        arr[0] = 10; //Starts indexing from 0
        System.out.println(arr[0]);
        System.out.println(arr.length); //to return size

        //int arr1[] = new int[-5]; //java.lang.NegativeArraySizeException at run time
       // arr1[0] = 20;
       // System.out.println(arr1[0]);

        int arr2[] ={10,20,30,40};
        //System.out.println(arr2[5]); //java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(arr2[-1]);

        //anynomyous array
       // sum(new int[] {1,2,3}); //PASSING int[] to the method sum()

        ArrayList <Integer> alist = new ArrayList<>(); //dynamic, stores only objects
        alist.add(10);
        alist.add(20);
        System.out.println(alist.size()); //to return the size


        
    }
    
}
