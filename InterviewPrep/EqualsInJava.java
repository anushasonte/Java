package InterviewPrep;

public class EqualsInJava {

    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        if(str1==str2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        if(str1.equals(str2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        String str3 = str2;

        if(str3==str2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        
    }
    
}
