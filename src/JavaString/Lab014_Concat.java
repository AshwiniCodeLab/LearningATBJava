package JavaString;

public class Lab014_Concat {
    public static void main(String[] args) {
        String fname="Ashwini";
        String lname="Suryavanshi";
        fname.concat(lname);
        System.out.println(fname);
        String fullname= fname.concat(lname);
        System.out.println("Your fullname is: "+fullname);
    }
}
