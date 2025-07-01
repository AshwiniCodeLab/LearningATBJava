package JavaBasics;

public class Lab051_BankTest {
    public static void main(String[] args) {
        Lab050_ClassObjects lb= new Lab050_ClassObjects("AshwiniShingate",99,500000);
        lb.showBalance();
        lb.deposit(20000);
        lb.showBalance();
        lb.withdraw(8000);
        lb.showBalance();
    }
}
