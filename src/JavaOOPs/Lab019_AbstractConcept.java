package JavaOOPs;

abstract class Shape1{
    abstract double CalculateArea();
}

class Circle1 extends Shape1{

    double radius;

    Circle1(double radius){
        this.radius= radius;
    }

    @Override
    double CalculateArea(){
    return 3.14*radius*radius;
    }
}

class Rectabgle1 extends Shape1{
    double length, breadth;
    Rectabgle1(double length, double breadth){
        this.length=length;
        this.breadth= breadth;
    }
    @Override
    double CalculateArea(){
        return length*breadth;
    }

}
public class Lab019_AbstractConcept {
    public static void main(String[] args) {
        Shape1 sh= new Circle1(4);
        System.out.println("The area of circle is "+sh.CalculateArea());
        Shape1 sh1= new Rectabgle1(10,30);
        System.out.println("The area of rectangle is: "+sh1.CalculateArea());
    }
}
