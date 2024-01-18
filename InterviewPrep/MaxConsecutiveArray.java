package InterviewPrep;
import java.util.*;
class MaxConsecutiveArray {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int arrSize = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i < arrSize; i++){
            System.out.println("Enter element "+(i+1) + " :");
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int maxSubset = getMaxSubset(arr);
        System.out.println("Length of Max consecutive subset possible: "  +maxSubset);
        sc.close();
    }

    public static int getMaxSubset(List<Integer> arr) {
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i-1)+ 1) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
        
    }
}