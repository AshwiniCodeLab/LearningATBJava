package JavaBasics;

public class Lab043_DivisionExample {
    public static void main(String[] args) {
        try{
            int a=10, b=0;
            int c=a/b;
            System.out.println("Result is: "+c);
        }catch (ArithmeticException e) {
            System.out.println("The exception is: "+e.getMessage());
        }
    }
}
