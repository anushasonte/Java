package InterviewPrep;

final class test {

    public int area (int radius){
        System.out.println("Area of circle!");
        return 3 * radius * radius;
    }

}

//gives an error
//public class finalKeyWord extends test {
public class finalKeyWord {

    //to methods
    public final int area (int radius){
        System.out.println("Area of circle!");
        return 3 * radius * radius;
    }

    //below gives an error
    /*
    public int area(int radius){

    } */

    public static void main(String[] args) {
        
        //to variables
        final int i = 10;
        // i = 20; gives an error

    }
    
}
