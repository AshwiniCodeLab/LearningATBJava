package JavaOOPs;

public class Lab010_MethodOverloading3 {

    void area(){
        System.out.println("In this program we are calculating areas.");
    }
    void area(int side){
        System.out.println("The area of square: "+(side*side));
    }
    void area(int length, int width){
        System.out.println("The area of rectangle: "+(.5*length*width));
    }
    void area(double radious){
        System.out.println("The area of circle is: "+(3.14*radious*radious));
    }

    public static void main(String[] args) {
        Lab010_MethodOverloading3 lo= new Lab010_MethodOverloading3();
        lo.area();
        lo.area(12);
        lo.area(4.1);
        lo.area(12,2);
    }

}
