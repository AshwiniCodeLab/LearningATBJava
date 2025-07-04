package JavaControlStmts;
//Check Largest of Three Numbers
public class Lab013_elseIf {
    public static void main(String[] args) {
        int a=10,b=30,c=37;
        if(a>b && a>c){
            System.out.println("A is greater than b and c ");
        } else if (b>c) {
            System.out.println("B is greate than c");
        }else {
            System.out.println("C is greate than a and b");
        }
    }
}
