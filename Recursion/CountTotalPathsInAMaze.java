package Recursion;

import java.util.Scanner;

//Problem statement
/*
Total paths in maze from (0,0) to (n,m)
Assume an n*m matrix
Condtions:
1. Move only right
2. Move only down

Used backtracking -> go to path, if dest found, it is ok. else go back.
*/

public class CountTotalPathsInAMaze {

    public static int countPaths(int i, int j, int n, int m){

        if(i == n-1 && j== m-1){ //Destination
            return 1;
        }

        if(i == n || j== m){ //boundary cells -> no path
            return 0;
        }

        //Move downwards
        int downPaths = countPaths(i+1, j, n, m);

        //Move rightwards
        int rightPaths = countPaths(i, j+1, n, m);

        int totalPaths = downPaths +rightPaths;

        return totalPaths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input n: ");
        int n = sc.nextInt();
        System.out.println("Enter input m: ");
        int m = sc.nextInt();
        int totalPaths = countPaths(0,0,n,m);
        System.out.println(totalPaths);
        sc.close();
        
    }
    
}
