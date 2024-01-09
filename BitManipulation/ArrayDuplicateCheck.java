package BitManipulation;

public class ArrayDuplicateCheck {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,4};
        int unique = 0;

        for(int i =0; i<arr.length; i++){
            unique = unique ^ arr[i];
        }

        System.out.println(unique);
    }
    
}
