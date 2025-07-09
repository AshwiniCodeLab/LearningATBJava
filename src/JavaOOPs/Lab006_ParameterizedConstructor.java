package JavaOOPs;
//// Creating parameterized constructor
public class Lab006_ParameterizedConstructor {

    int num1;
    int num2;

    Lab006_ParameterizedConstructor(int num1, int num2){
        this.num1=num1;
        this.num2= num2;
    }

    public static void main(String[] args) {
        System.out.println("Example of parameterized constructor...");
        Lab006_ParameterizedConstructor pc= new Lab006_ParameterizedConstructor(10,20);
        System.out.println(pc.num1);
        System.out.println(pc.num2);


    }
}
