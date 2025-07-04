package JavaControlStmts;
//Question: Check if a number is positive and even.
public class Lab011_NestedIf {
    public static void main(String[] args) {
        int num=48;
        if (num>0){
            if (num%2==0) {
                System.out.println("The given number is positive Even.");
            }
            else {
                System.out.println("The given number is positive odd.");
            }
        }

    }
}
