package JavaOOPs;

class person {
    String name;

    person(String name) {
        this.name = name;
    }
}
public class Lab002_Inheritance extends person {
    int age;

 Lab002_Inheritance(String name, int age) {
        super(name);
        this.age = age;
        this.name = name;

    }

    public void display() {
        System.out.println("The name of stident is " + name + " and age is: " + age);
    }

    public static void main(String[] args) {
        Lab002_Inheritance in = new Lab002_Inheritance("sws", 20);
        in.display();

    }
}

