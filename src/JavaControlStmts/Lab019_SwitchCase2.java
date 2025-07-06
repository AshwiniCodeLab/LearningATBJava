package JavaControlStmts;
// switch statement where cases are based on a int.
// We've created a variable grade. Based on value of grade, each case is checked.


public class Lab019_SwitchCase2 {
    public static void main(String[] args) {
        int grade=2;
        switch (grade){
            case 1:
                System.out.println("Excellent...");
                break;
            case 2:
            case 3:
                System.out.println("Well done..");
                break;
            case 4:
                System.out.println("You are passed...");
                break;
            case 5:
                System.out.println("You are failed..");
                break;
            default:
                System.out.println("Invalid grade");

        }
        System.out.println("You are grade is "+grade);
    }
    }
