package JavaControlStmts;

import java.time.Year;

public class Lab006_TOLeapYear {
    public static void main(String[] args) {
        int year=2005;
        boolean isleap= (year%4==0)? true:
                (year%100==0)? false:
                        (year%400==0);
        System.out.println("The given year "+year+" is: "+isleap);
    }
}
