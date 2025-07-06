package JavaControlStmts;
//switch statement where cases are based on a char.
// We've created a variable grade. Based on value of grade, each case is checked.
public class Lab018_SwitchCase1 {
    public static void main(String[] args) {
        char grade='C';
        switch (grade){
            case 'A':
                System.out.println("Excellent...");
                break;
            case 'B':
            case 'C':
                System.out.println("Well Done...");
                break;
            case 'D':
                System.out.println("You are passed..");
                break;
            case 'E':
                System.out.println("You are failed..");
                break;
            default:
                System.out.println("Invalid grade.");
        }
        System.out.println("Your grade is "+grade);
    }

}
