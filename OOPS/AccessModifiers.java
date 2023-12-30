package OOPS;

/*
Packages in java contain related code. For improved readability and easy code maintainability!
Two types:
1. Built in-packages : Ex: java.util for Scanner class, Arraylist, HashSet etc.
2. User defined packages : Ex: OOPS
User defined packages can be used in other class by importing them. 
For example, below Account is used in Polymorphism.java


Access modifiers: what is accessible to whom. 
To avoid sensitive info disclosure.
These access modfiers can be applied infront of methods and fields.

1. Public : If a method or field has access modifier 'public', then it is accessible anywhere in the class and the classes 
that imported this package.
2. Private : Only within the same class.
3. Protected : Within same package + sub classes only.
4. Default : no keyword, if no access modifier is specified, default is used. These members are accessible anywhere within the same package.
*/

class Account{ //Used in Polymorphism.java
    public String name; //public
    String accountType; //default
    protected String email; //protected
    private int accountNumber; //private

    //Private members can be accessed using getters,setters
    
    //Getter
    public int getAccountNumber(){
        return accountNumber;
    }
    
    //Setter
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void printAccountInfo(String name,String accountType, String email){
        System.out.println("Name: "+name+" ,Account type: "+accountType+ " ,Email: "+email);
    }
}

public class AccessModifiers {

    public static void main(String[] args) { //even main function is public so that compiler can find this class during execution

        Account account1 = new Account();
        account1.name = "Account1";
        account1.email = "account1@gmail.com";
        account1.accountType = "Checking";
        account1.printAccountInfo(account1.name, account1.email, account1.accountType);
        //account1.accountNumber = 122345; //not accessible

        account1.setAccountNumber(12345);
        System.out.println("Account Number: " +account1.getAccountNumber());
        
    }
    
}
