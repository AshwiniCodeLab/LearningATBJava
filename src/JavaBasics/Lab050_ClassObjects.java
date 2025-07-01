package JavaBasics;
//bank system
public class Lab050_ClassObjects {
    String accountHolderName;
    int accountNumber;
    double balance;

    public Lab050_ClassObjects(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public  void deposit(double amount){
        balance +=amount;
        System.out.println("The amount "+amount+" deposited successfully");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("The amount " + amount + " is withdrawn successfully");
        } else {
            System.out.println("The balance is insufficient.");
        }
    }
        public void showBalance(){
            System.out.println("Account holder: "+accountHolderName);
            System.out.println("Account number: "+accountNumber);
            System.out.println("Available balance is: "+balance);
        }

    }

