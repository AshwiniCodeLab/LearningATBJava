package JavaControlStmts;
/*Assign a grade using ternary operator based on marks:
90+ → A
75–89 → B
50–74 → C
<50 → F*/
public class Lab005_GradeSystem {
    public static void main(String[] args) {
        int marks=48;

        String grade= (marks>=90)? "A":
                (marks>=75)? "B":
                        (marks>=50)? "C":
                                "F";
        System.out.println("Your obtained grade is: "+grade);
    }
}
