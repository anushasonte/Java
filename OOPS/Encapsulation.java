package OOPS;

/*
Encapsulation: Data and functions are combined in a single entity.
Data hiding is possible using encapsulation. Using access modifiers. (protected, public, private)
*/


class Account{ 
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

public class Encapsulation {

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

