package JavaOOPs;
//Class Vehicle with a method run() → prints "Vehicle is running"
//Class Vehicle is running extends Vehicle, overrides run() to print "Bike is running fast"
class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle {
    void run(){
        System.out.println("Bike is running fast");
    }

}
public class Lab012_Inheritance{
    public static void main(String[] args) {
        Vehicle vc= new Bike();
        vc.run();

    }

}
