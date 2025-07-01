package JavaBasics;
//calculator
public class Lab041_MethodOverload {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int  b, int c){
        return  a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    void display(){
        System.out.println("done program");
    }
    public static void main(String[] args) {
        Lab041_MethodOverload lm= new Lab041_MethodOverload();
        System.out.println(lm.add(10,20));
        System.out.println(lm.add(10.23,78.90));
       int a= lm.add(12,34,44);
        System.out.println(a);
    }
}
