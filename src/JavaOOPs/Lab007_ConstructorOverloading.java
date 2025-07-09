package JavaOOPs;

public class Lab007_ConstructorOverloading {
    String name;
    int age;
    // no-args constructor
    Lab007_ConstructorOverloading(){
        name="ashwini";
        age=19;
    }
    // parameterized constructor having one parameter
    Lab007_ConstructorOverloading(String name){
        this.name=name;
        age=10;
    }

    Lab007_ConstructorOverloading(String name, int age){
        this.name=name;
        this.age=age;
    }
    public  void  displayDetails(){
        System.out.println("The name is: "+this.name);
        System.out.println("The age is: "+this.age);
    }
    public static void main(String[] args) {
        Lab007_ConstructorOverloading lb= new Lab007_ConstructorOverloading();
       lb.displayDetails();
       Lab007_ConstructorOverloading lb1= new Lab007_ConstructorOverloading("Arjun");
       lb1.displayDetails();
       Lab007_ConstructorOverloading lb2= new Lab007_ConstructorOverloading("Sona",30);
       lb2.displayDetails();
    }
}
