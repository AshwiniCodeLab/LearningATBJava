package JavaControlStmts;
/*Question: Write a Java program to
 find the maximum between two numbers using the ternary operator.*/
public class Lab002_TOMax {
    public static void main(String[] args) {

        int a = 30, b = 40;
        int max = (a > b) ? a : b;
        System.out.println("The max between " + a + " and " + b + " is: " + max);

    }
}