package JavaOOPs;
/*Create a class hierarchy for the following:
Class: User → method: login()
Class: Customer extends User → method: placeOrder()
Class: Seller extends User → method: addProduct()
In main(), create objects for Customer and Seller, and call all relevant methods.*/
class User{
    void login(){
        System.out.println("User able to login");
    }
}
class Customer extends User{

    void placeOrder(){
        super.login();
        System.out.println("Order placed by customer");
    }
}
class Seller extends User{


    void addProduct(){
        super.login();
        System.out.println("Product added by seller");
    }
}

public class Lab015_HierarchicalInheritance {
    public static void main(String[] args) {
        Customer cs= new Customer();
       // cs.login();
        cs.placeOrder();

        Seller se= new Seller();
        se.addProduct();
       // se.login();
    }
}
