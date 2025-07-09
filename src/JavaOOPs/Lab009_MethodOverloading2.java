package JavaOOPs;
//Practice Example 1: Print Info (Different Parameters)
public class Lab009_MethodOverloading2 {

    void  print(){
        System.out.println("I am from without parameterized method....");
    }
    void print(String name){
        System.out.println("My name is: "+name);
    }
    void  print(String name, int age){
        System.out.println("My name and age is: "+name+" "+age);
    }

    public static void main(String[] args) {
        Lab009_MethodOverloading2 lb= new Lab009_MethodOverloading2();
        lb.print();
        lb.print("ash");
        lb.print("skna",19);
    }

}
