package JavaOOPs;
/*Try writing an interface:
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}
And then implement it in a class called SBI*/
interface Bank1 {
    void deposit(double amount);
    void withdraw(double amount);
    static void info() {
        System.out.println("Welcome to our branch!!!");
    }
}
class SBII implements Bank1{
    double balance=9000;
    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("The amount deposited is: "+amount);
        System.out.println("The total balance upto date is: "+balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance>amount){
            balance-=amount;
            System.out.println("The amount withdrawal is: "+amount);
            System.out.println("The current balance is: "+balance);
        }else{
            System.out.println("Insufficient balance...");
            System.out.println("Enter amount less than: "+balance);
        }

    }
}

public class Lab0022_interface {
    public static void main(String[] args) {
        Bank1 b1= new SBII();
        Bank1.info();
        b1.withdraw(2000);
    }
}
