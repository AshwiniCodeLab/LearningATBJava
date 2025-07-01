package JavaBasics;

public class Lab044_ArithmeticException {
    public static void main(String[] args) {
        try{
        int a=100, b=0;
            int result = a / b;
            System.out.println("The result of division is: " + result);
        }catch (ArithmeticException e){
            System.out.println("The arithmetic exception is: "+e.getMessage());
        }
    }
}
