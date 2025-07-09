package JavaOOPs;
/*Class Animal
Class Dog extends Animal
Class Cat extends Animal */

class Animal{
    void sleep(){
        System.out.println("I am from animal");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("I am from dog");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("I am from cat");
    }
}

public class Lab014_HierarchicalInheritance {
    public static void main(String[] args) {
    Dog ac= new Dog();
    Cat ca= new Cat();
    ca.meow();
    ac.sleep();
    ac.bark();

    }
}
