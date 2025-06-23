package JavaBasics;

import java.util.Scanner;
//In an ATM project, a user may choose from a list of options like:
//Check Balance
//Deposit Money
//Withdraw Money
//Exit
//We can handle this using switch case.
public class ATMSwitchCase {
    public static void main(String[] args) {
        double balance= 10000;
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Check balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw money");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        int choice= sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Your balance is: "+balance);
                break;
            case 2:
                System.out.println("Enter amount to deposit: ");
                double deposit=sc.nextDouble();
                balance +=deposit;
                System.out.println("Money deposited successfully and your new balance is: "+balance);
                break;
            case 3:
                System.out.println("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();
                if(withdraw<=balance) {
                    balance -= withdraw;
                    System.out.println("Please collect your cash and your new balance is: " + balance);
                }
                else{
                System.out.println("Insufficient balance");
            }
                    break;
            case 4:
                System.out.println("Thank you for using ATM! :)");
                break;
            default:
                System.out.println("Invalid choice, please try again");
        }
        sc.close();

    }
}
