package JavaControlStmts;
// Question: Assign grade based on marks.
public class Lab010_IfElseIf {
    public static void main(String[] args) {
        int marks=90;
        if(marks>90){
            System.out.println("Grade A- "+marks);
        } else if (marks>75) {
            System.out.println("Grade B- "+marks);
        } else if (marks>50) {
            System.out.println("Grade C- "+marks);
        }else {
            System.out.println("Failed..."+marks);
        }
    }
}
