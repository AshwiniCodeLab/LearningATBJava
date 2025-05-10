package JavaBasics;

import java.util.Scanner;

public class Lab005_EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println("The number "+a+" is Even.");
        }
        System.out.println("The number "+a+" is Odd.");
    }
}
