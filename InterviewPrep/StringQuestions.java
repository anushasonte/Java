package InterviewPrep;

public class StringQuestions {

    public static void main(String[] args) {

        //Different ways to create a string
        String s1 = new String("Anusha");
        String s2 = "Anusha";

        System.out.println(s1);
        System.out.println(s2);

        //intern() -> stores obj on pool
        String s3 = s1.intern(); //creates a copy of this heap obj in pool, if already exists in pool, returns the reference.
        System.out.println(s2==s3);

        //concatenate
        String s4 = "Hello";
        String s5 = " World";

        String result = s4 + s5;
        System.out.println(result);

        String result1 = s4.concat(s5);
        System.out.println(result1);
        
    }
    
}
