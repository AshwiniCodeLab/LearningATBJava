package JavaBasics;

public class Lab046_NullPointerException {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println("The exception is: "+e.getMessage());
        }

    }
}
