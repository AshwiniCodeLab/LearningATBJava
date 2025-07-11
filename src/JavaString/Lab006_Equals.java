package JavaString;

public class Lab006_Equals {
    public static void main(String[] args) {
        String lang= "Java";
        String lang1="java";
        String s3 = new String("Java");
        System.out.println(lang.equals(s3));
        System.out.println("The results of equals is: "+lang1.equals(lang));
        System.out.println("The result of equalsignorecase is: "+lang.equalsIgnoreCase(lang1));
    }
}
