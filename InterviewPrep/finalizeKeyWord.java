package InterviewPrep;

class testFinalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize() called!");
    }
}

public class finalizeKeyWord {

    public static void main(String[] args) {

        testFinalize t = new testFinalize();
        t = null;
        System.gc();
        
    }
    
}
