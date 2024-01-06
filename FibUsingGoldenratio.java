import java.util.Scanner;
public class FibUsingGoldenratio {

    public static int findFibonacci(int n){
        int result = (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Enter range: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i< num; i++){
            System.out.print(findFibonacci(i) + " ");
        }
        
    }
    
}
