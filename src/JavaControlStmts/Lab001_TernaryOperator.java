package JavaControlStmts;
/* we're creating two variables a and b and using
ternary operator we've decided the values of b and printed it.*/
public class Lab001_TernaryOperator {
    public static void main(String[] args) {
        int a=29;
      int  b= (a==20) ? 30 : 90;
        System.out.println("The value of b is: "+b);

        b= (a==29) ? 90 : 209;
        System.out.println("The value of b is: "+b);



    }
}
