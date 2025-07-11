package JavaString;

public class Lab011_Split {
    public static void main(String[] args) {
        String langs="java,c++,python,c#,HTML";
        String[] splits= langs.split(",");
        for(String i: splits){
            System.out.println(i);
        }

    }
}
