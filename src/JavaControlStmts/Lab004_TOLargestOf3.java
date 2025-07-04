package JavaControlStmts;

public class Lab004_TOLargestOf3 {
    public static void main(String[] args) {
        int a=90,b=200,c=40;

        int large=(a>b) ? (a>c? a: c) :(b>c? b: c);
        System.out.println("Tha largest value among "+a+","+b+","+c+" is "+large);

    }
}
