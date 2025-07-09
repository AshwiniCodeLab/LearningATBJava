package JavaOOPs;
//Create a program with three classes:
//Class Person → has method display() that prints "I am a person"
//Class Employee extends Person → adds method showJob() that prints "I am an employee"
//Class Developer extends Employee → adds method showSkill() that prints "I write code"
//Now create a main() method and:
//Create an object of Developer
//Call all three methods from the object

class Person{
    void  display(){
        System.out.println("I am a person");
    }
}
class Employee extends Person {
    void showJob() {
        System.out.println("I am an employee");
    }
}
 class Developer extends Employee{
     void showSkill(){
         System.out.println("I write code");
 }
}
public class Lab013_MultilevelInheritance {
    public static void main(String[] args) {
        Developer p= new Developer();
        p.showSkill();
        p.display();
        p.showJob();



    }
}
