package JavaBasics;

import java.util.Scanner;

public class Lab012_If {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:" );
        int age=sc.nextInt();
        if(age<=18){
            System.out.println("The "+age+" is belongs between 1 to 18");
        }
        System.out.println("The "+age+" is above 18");
    }

}
