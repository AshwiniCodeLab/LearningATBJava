package JavaBasics;

public class Lab034_LargestOfThree {
    public static void main(String[] args) {
        int a=30,b=35,c=50;
        if(a>b && a>c){
            System.out.println("a is greater than b and c: "+a);
        }else if (b>c){
            System.out.println("b is greate than a and b: "+b);
        }else {
            System.out.println("C is greater than a nd b: "+c);
        }

    }
}
