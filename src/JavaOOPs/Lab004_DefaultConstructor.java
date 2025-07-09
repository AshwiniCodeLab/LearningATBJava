package JavaOOPs;

public class Lab004_DefaultConstructor {
    int num1;
    int num2;

    public static void main(String[] args) {
        // We didn't created any structure
        // a default constructor will invoke here
        Lab004_DefaultConstructor dc= new Lab004_DefaultConstructor();
        System.out.println(dc.num1);
        System.out.println(dc.num2);
    }
}
