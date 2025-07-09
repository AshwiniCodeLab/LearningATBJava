package JavaOOPs;
//This example creates no-args constructor.
public class Lab005_NoArgsConstructor {

    int num1;
    int num2;
    // Creating no-args constructor
    Lab005_NoArgsConstructor(){
        num1=19;
        num2=39;
    }

    public static void main(String[] args) {
        //no-args constructor will invoke
        Lab005_NoArgsConstructor NA= new Lab005_NoArgsConstructor();
        System.out.println("Num1:"+NA.num1);
        System.out.println("Num2: "+NA.num2);

    }

}
