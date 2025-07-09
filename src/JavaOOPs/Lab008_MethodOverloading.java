package JavaOOPs;

public class Lab008_MethodOverloading {
    void add(){
        System.out.println("Nothing to add!.....");
    }
    void add(int a, int b){
        System.out.println("The addition of int a and b is: "+(a+b));
    }
    void add(double a, double b){
        System.out.println("The addition of double a and b is: "+(a+b));
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Lab008_MethodOverloading mo= new Lab008_MethodOverloading();
       mo.add();
       mo.add(10,30);
       mo.add(10.2,23.2);
        System.out.println("The addition is a, b and c: "+mo.add(12,23,43));
    }
}
