package JavaOOPs;

class Bank{
    double getInterestRate(){
        return 5.0;
    }
}

class SBI extends Bank{

    @Override
    double getInterestRate() {
        return 6.0;
    }
}

class ICICI extends Bank{
    @Override
    double getInterestRate() {
        return 8.9;
    }
}

public class Lab011_MethodOverloading4 {
    public static void main(String[] args) {
        Bank b;
        b= new SBI();
        System.out.println("The Intrest rate of SBI is: "+b.getInterestRate());

        b= new ICICI();
        System.out.println("The interest rate of iCICI is: "+b.getInterestRate());
    }
}