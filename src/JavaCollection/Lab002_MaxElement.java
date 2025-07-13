package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lab002_MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(120);
        for(Integer a: num){
            System.out.print(a+" ");
        }
        System.out.println("The max in arraylist: "+Collections.max(num));

    }
}
