package Arrays;
import java.util.*;

public class IntersectionOfArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int sizeofarray1 = sc.nextInt();
        int arr1[] = new int[sizeofarray1];
        for(int i=0;i<sizeofarray1;i++){
            System.out.print("Enter element "+(i+1) + ": ");
            arr1[i] = sc.nextInt();
            
        }
         System.out.print("Enter size of array 2: ");
        int sizeofarray2 = sc.nextInt();
        int arr2[] = new int[sizeofarray2];
        for(int i=0;i<sizeofarray2;i++){
            System.out.print("Enter element "+(i+1) + ": ");
            arr2[i] = sc.nextInt();
            
        }

        ArrayList<Integer> result = findIntersection(arr1,arr2);
        System.out.println(result);
        sc.close();


        
    }

    private static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        TreeSet<Integer> treeset = new TreeSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            treeset.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(treeset.contains(arr2[i])){
                result.add(arr2[i]);
            }
        }
        return result;
    }
    
}

