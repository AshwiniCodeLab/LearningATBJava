package JavaBasics;

public class Lab063_IfElse {
    public static void main(String[] args) {
        int x=50, y=70,z=90;
        if(x>y){
            if(x>z){
                System.out.println("X is greater than y and z");
            }else{
                System.out.println("z is greater ");
            }
        }else{
            if(y>z){
                System.out.println("Y is greate than z and x");
            }else {
                System.out.println("Z is greater than y and x");
            }
        }
    }
}
