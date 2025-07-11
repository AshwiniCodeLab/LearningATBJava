package JavaString;

public class Lab002_ReverseFunction {
    public static void main(String[] args) {
        String name="Swami";
        String reverse= new StringBuilder(name).reverse().toString();
        System.out.println(reverse);
    }
}
