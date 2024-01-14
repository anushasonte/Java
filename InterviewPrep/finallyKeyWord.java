package InterviewPrep;

public class finallyKeyWord {

    public static void main(String[] args) {
        try{
            int i = 10;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally executed!");
        }
    }
    
}
