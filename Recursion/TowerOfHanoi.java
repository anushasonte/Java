package Recursion;
import java.util.*;

//Only 1 disk can be transferred in one step.
//Smaller disks are always kept on larger disks.

/*
Time complexity = O(2^n-1) = O(2^n)

T(n) = 2 T(n-1) + 1 
T(n-1) = 2 T(n-2) + 1
.
.
.
.
T(1) = 1
*/

public class TowerOfHanoi {

    public static void towersOfHanoi(int n, String source, String helper, String dest){

        if(n==1){ //base condition
            System.out.println("Tranfer disk: "+n+ " from "+source+ " to "+dest);
            return;
        }

        //Step 1: Transfer (n-1) disks from Source to Helper using Destination as helper
        towersOfHanoi(n-1, source,dest,helper);

        //Step 2: Transfer 1 disk from Source to Destination 
        System.out.println("Tranfer disk: "+n+ " from "+source+ " to "+dest);

        //Step 3: Transfer (n-1) disks from Helper to Destination using Source as helper
        towersOfHanoi(n-1, helper,source,dest);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int n = sc.nextInt();
        towersOfHanoi(n, "Source Tower", "Helper Tower", "Destination Tower");
        sc.close();

        
    }
    
}
