package JavaOOPs;

public class Lab003_Constructor {
    //creating constructor
    Lab003_Constructor(){
        System.out.println("I am from constructor");
    }

    public static void main(String[] args) {
        //creating class object
        //that will invoke the constructor
        Lab003_Constructor lb= new Lab003_Constructor();
        System.out.println("I ma from main method..");


    }
}
