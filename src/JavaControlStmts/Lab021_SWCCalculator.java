package JavaControlStmts;

import java.util.Scanner;

public class Lab021_SWCCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fist number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator(+,_,*,/): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("The addition is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The subtraction is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The multiplication is: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("The division result is: " + (num1 / num2));
                else
                    System.out.println("Can not divide by 0.");
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
