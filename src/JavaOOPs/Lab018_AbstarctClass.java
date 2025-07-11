package JavaOOPs;
abstract  class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{

    @Override
    double calculateArea() {
        double r=2;
        return(3.14*r*r);
    }
}

class Rectangle extends Shape{

    @Override
    double calculateArea() {
        double length = 5,breadth=5;
        return length*breadth;
    }
}
public class Lab018_AbstarctClass {
    public static void main(String[] args) {
        Shape s= new Circle();
        System.out.println(s.calculateArea());
        Shape s1= new Rectangle();
        System.out.println(s1.calculateArea());
    }
}
