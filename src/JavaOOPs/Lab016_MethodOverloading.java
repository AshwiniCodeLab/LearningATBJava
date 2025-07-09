package JavaOOPs;

public class Lab016_MethodOverloading {
        double balance;
        double deposit(double amount){
            balance +=amount;
            System.out.println("The amount deposited is: "+amount);
            return balance;
        }
        
        double deposit(String chequeNumber, double amount){
            System.out.println("The amount "+amount+" is deposited via check "+chequeNumber);
           balance+=amount;
           return  balance;
        }
        double deposit(String accountNumber, String ifsc, double amount){
            System.out.println("The amount "+amount+" is deposited by account number "+accountNumber+" has IFSC code "+ifsc);
            balance+=amount;
            return balance;
        }
        public  void show(){
            System.out.println("The total balance is: "+balance);
        }

    public static void main(String[] args) {
            Lab016_MethodOverloading lb= new Lab016_MethodOverloading();
            lb.deposit(1200);
            lb.show();
            lb.deposit("Ch001",2000);
            lb.show();
            lb.deposit("Acc001223","ICICI1123",10000);
            lb.show();;


    }
}
