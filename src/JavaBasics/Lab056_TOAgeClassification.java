package JavaBasics;

public class Lab056_TOAgeClassification {
    public static void main(String[] args) {
        //adult>18, minor<18,senior>65
        int age=65;
        String result = (age<=18)? "Minor" : age<65? "Adult" : "Senior" ;
        System.out.println("The age is "+age+" hence you are belonging from age category "+result+".");


    }
}
