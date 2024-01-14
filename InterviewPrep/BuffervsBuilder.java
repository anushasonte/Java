package InterviewPrep;

public class BuffervsBuilder {

    public static void main(String[] args) {

        String str = new String("Hello");
        StringBuilder builder = new StringBuilder("Hello");
        StringBuffer buffer = new StringBuffer("Hello");

        str.concat(" World!");
        builder.append(" World!");
        buffer.append(" World!");

        System.out.println(str); //Immutable!
        System.out.println(builder);
        System.out.println(buffer);

        String newString = str.concat(" World!");
        System.out.println(newString);
        
    }
    
}
