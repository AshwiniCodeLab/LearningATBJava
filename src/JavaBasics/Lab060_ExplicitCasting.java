package JavaBasics;

import java.io.PrintStream;

//You calculate total price in double, but your printer only accepts int values. So you use explicit casting.
public class Lab060_ExplicitCasting {
    public static void main(String[] args) {
        double price=100.36;
        int quantity= 18;
        double total= price*quantity;
        int printablePrice= (int)total;
        System.out.println("Total actual price in rs is: "+total);
        System.out.println("Total price you have to pay: "+printablePrice);
        System.out.println("Note: Decimal part is not printed due to printer limitation.");

    }
}
