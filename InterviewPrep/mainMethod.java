package InterviewPrep;

public class mainMethod {

    static {
        System.out.println("In static block!");
    }


    //public - JVM needs to access it
    //static - can be called without creating an object
    //public static void main(String... args) { - valid and allowed
        public static final void main(String[] args) { //final is allowed
            System.out.println("In actual main method!");
        }
    
        //overloading is allowed - however this will not be called
        public static void main(int args) {
            System.out.println("In int main method!");
        }
    
        public static void main(int arg1, String arg2) {
            System.out.println("In int,string main method!");
        }

    
}
