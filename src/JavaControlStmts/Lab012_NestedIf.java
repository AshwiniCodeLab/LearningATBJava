package JavaControlStmts;
//Check if a Year is Leap Year
public class Lab012_NestedIf {
    public static void main(String[] args) {
        int year = 1993;
        if (year % 4 == 0) {
            System.out.println("The year " + year + " is Leap.");
        } else if (year % 400 == 0) {
            System.out.println("The year " + year + " is Leap.");
        } else if (year % 100 == 0) {
            System.out.println("The year " + year + " is not a Leap");
        }
        else {
            System.out.println("The year " + year + " is not a Leap");
        }
        }
    }