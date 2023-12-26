//It is a non primitive data type.
//Used to store list of items of same type.

//Syntax
/* 
 datatype arrayName[] = new datatype[size];
*/

//Array indexing in java starts from 0, so they are called Zero-indexed.


package Arrays;

public class ArraysBasic {

    public static void main(String[] args) {

        int marks[] = new int[3]; //Defining an array
        //The above array would occupy a total of 12 bytes in memory. [size of int = 4 * 3 = 12]

        marks[0] = 100; //Storing elements in array
        marks[1] = 90;
        marks[2] = 70;

        //int []marks1 = new int[3]; //can also be defined like this

        //int marks2[] = {100, 90, 70}; //can be defined and stored in the same line when we already know the values of the array.

        //System.out.println(marks); //Prints the classname and hashcode
        System.out.println(marks.length); //Prints the size of the array

        //Iterating through array
        for(int i=0; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        
    }
    
}
