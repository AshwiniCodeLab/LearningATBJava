package JavaControlStmts;

public class Lab017_TriangleType {
    public static void main(String[] args) {
        int a=10, b=30,c=49;

        if(a==b && b==c){
            System.out.println("Equilateral: all sides equal triangle");
        } else if (a==b || b==c || a==c) {
            System.out.println("Isosceles: two sides equal");
        }else {
            System.out.println("Scalene: all sides different");
        }
    }
}
