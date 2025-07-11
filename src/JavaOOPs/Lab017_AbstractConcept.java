package JavaOOPs;

abstract  class  Vehicle1{
    abstract void start();
    void stop(){
        System.out.println("The vehicle has stopped...");
    }
}
class Bike1 extends Vehicle1{
    @Override
    void start(){
        System.out.println("Bike starts with kick");
    }
}

class Car1 extends Vehicle1{
    @Override
    void start(){
        System.out.println("Car has started with key..");
    }
}

public class Lab017_AbstractConcept {
    public static void main(String[] args) {
        Vehicle1 vc= new Car1();
        vc.start();
        vc.stop();

        Vehicle1 vc1= new Bike1();
        vc1.start();
        vc1.stop();

    }
}
