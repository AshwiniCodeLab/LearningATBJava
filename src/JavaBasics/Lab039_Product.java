package JavaBasics;

public class Lab039_Product {
    String name;
    int quantity;
    double price;

    public Lab039_Product(String name, int quantity, double price){
        this.name= name;
        this.quantity= quantity;
        this.price= price;
    }

    //method calculate total price
    double getTotal(){
        return quantity*price;
    }

    void  showDetails(){
        System.out.println("The product name is: "+name);
        System.out.println("The price per item is: "+price);
        System.out.println("The quantity is: "+quantity);
        System.out.println("The total is: "+getTotal());
    }
}
