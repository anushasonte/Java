package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllNegativeToOneSide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int sizeofarray1 = sc.nextInt();
        int arr1[] = new int[sizeofarray1];
        for(int i=0;i<sizeofarray1;i++){
            System.out.print("Enter element "+(i+1) + ": ");
            arr1[i] = sc.nextInt();
            
        }
        Arrays.sort(arr1);

        for(int i=0;i<sizeofarray1;i++){
            System.out.print(arr1[i]+ " ");   
        }
        
        sc.close();
        
    }
    
}
