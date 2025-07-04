package JavaControlStmts;
/*Write a Java program to determine the category of a person based on their age:
Age < 13 → "Child"
Age between 13 and 19 → "Teen"
Age between 20 and 59 → "Adult"
Age 60+ → "Senior"*/

public class Lab007_AgeCategory {
    public static void main(String[] args) {
        int age=39;
        String category=(age<13)? "Child":
                (age<=19)? "Teen":
                        (age<=59)? "Adult": "Senior";
        System.out.println("According to your age "+age+" you are belongs from "+category+" category.");

    }
}
