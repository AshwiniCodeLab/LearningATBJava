package JavaBasics;

public class Lab052_TernaryOperator {
    public static void main(String[] args) {
        int age=18;
        String CanIVote= (age>=18)? "Yes, you are eligible": "No, You are not eligible";
        System.out.println("The final result is: "+CanIVote);
    }
}
