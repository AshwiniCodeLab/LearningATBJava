package JavaBasics;
//class person
public class Lab037_ClassObject {
    String name;
    int age;

    void showDetails(){
        System.out.println("Person name is: "+name);
        System.out.println("Person age is: "+age);
    }

    public static void main(String[] args) {
        Lab037_ClassObject p= new Lab037_ClassObject();
        p.name="Ashwini";
        p.age=30;
        p.showDetails();
    }
}
