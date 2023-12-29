package Recursion;

import java.util.Scanner;

//Place tiles of size 1*m in matrix of size n*m

public class PlaceTilesInMatrix {


    public static int placeTiles(int n, int m){
        //Base condition
        if(n==m){ //Either place all of them horizontally or all of them vertically
            return 2;
        }
        if(n<m){ //Only horizontal possible
            return 1;
        }


        //Place tiles horizontally
        int horizontalPaths = placeTiles(n-1,m);

        //Place tiles veetically
        int verticalPaths = placeTiles(n-m,m);

        int totalPaths = horizontalPaths + verticalPaths;
        return totalPaths;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input n: ");
        int n = sc.nextInt();
        System.out.println("Enter input m: ");
        int m = sc.nextInt();
        int totalPaths = placeTiles(n,m);
        System.out.println(totalPaths);
        sc.close();
        
    }
    
}
