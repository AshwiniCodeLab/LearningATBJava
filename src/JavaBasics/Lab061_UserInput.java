package JavaBasics;
import java.util.Scanner;
public class Lab061_UserInput {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        System.out.println("Enter your weight: ");
        double weight= sc.nextDouble();
        System.out.println("Do you like tea??");
        boolean ans=sc.nextBoolean();

        System.out.println("My name is "+name+" and my age and weight are "+age+" and "+weight);


    }
}
