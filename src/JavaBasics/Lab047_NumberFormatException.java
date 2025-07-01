package JavaBasics;

public class Lab047_NumberFormatException {
    public static void main(String[] args) {
        try{
            String name="abc";
            int num= Integer.parseInt(name);
            System.out.println(num);
        }catch (NumberFormatException e)
        {
            System.out.println("The exception is: "+e.getMessage());
        }
    }
}
