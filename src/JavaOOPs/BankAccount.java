package JavaOOPs;
/*Create a class BankAccount with the following overloaded constructors:
BankAccount() – default: account type = "Savings", balance = 0
BankAccount(String name) – sets name, type = "Savings"
BankAccount(String name, String type) – sets both
BankAccount(String name, String type, double balance) – sets all
Also, create a method showDetails() to print account info.*/
public class BankAccount {
    String account_type;
    double balance;
    String name;
    BankAccount(){
        account_type = "Savings";
        balance = 0;
    }

    BankAccount(String name){
        this.name= name;
        account_type = "Savings";
    }

    BankAccount(String name, String type){
        this.name=name;
        this.account_type= type;
    }
    BankAccount(String name, String type, double balance){
        this.name=name;
        this.account_type= type;
        this.balance= balance;
    }

    void showDetails(){
        System.out.println("The account holder is: "+name+" having account type: "+account_type+" and balance is upto date: "+balance);
    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.showDetails();
        BankAccount ba1=new BankAccount("Ashwini");
        ba1.showDetails();
        BankAccount ba2= new BankAccount("sona","Current");
        ba2.showDetails();
        BankAccount ba3= new BankAccount("Priya","Business",900000);
        ba3.showDetails();

    }
}
