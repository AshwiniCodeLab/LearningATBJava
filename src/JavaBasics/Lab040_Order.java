package JavaBasics;

public class Lab040_Order {
    public static void main(String[] args) {
        Lab039_Product p= new Lab039_Product("Corrugated Box", 12,120);
        Lab039_Product p1= new Lab039_Product("Packaging material", 5,150);
        System.out.println("-----Order Summary------");
        System.out.println();
        p.showDetails();
        System.out.println();
        p1.showDetails();
        System.out.println("----------------------------------------");
        double total_Bill= p.getTotal()+p1.getTotal();
        System.out.println("The total bill is: "+total_Bill);

    }
}
