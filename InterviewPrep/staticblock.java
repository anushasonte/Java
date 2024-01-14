package InterviewPrep;

class Testing{
    static int i = 10;
    static{
        System.out.println(i+10);
        System.out.println("Inside static block");
    }
    {
        System.out.println(i+20);
        System.out.println("Normal block");
    }
}

public class staticblock {
    public static void main(String[] args) {
        Testing t = new Testing();
        
    }
    
}
