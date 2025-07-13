package JavaCollection;

import java.util.ArrayList;

public class Lab001_AddPrint {
    public static void main(String[] args) {
        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Dragon");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }
}
