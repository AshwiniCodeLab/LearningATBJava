package JavaBasics;

import java.util.Scanner;

public class Lab014_IfElseIf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int amount=sc.nextInt();
        float discount = 0;
        if(amount>5000) {
            discount = (float) (amount * .1);
        } else if (amount<1000) {
            discount=(float) (amount*.01);
        }else {
            System.out.println("invalid amount");
        }
        System.out.println("The discount is: " +discount);
        System.out.println("The payable amount: " + (amount - discount));
    }
}
