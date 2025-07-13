package JavaString;

import java.util.ArrayList;

public class Lab019_CommonElement {
    public static void main(String[] args) {
        String[] arr1={"one","two","five","nine","eight"};
        String[] arr2={"one","four","five","eight","ten"};
        ArrayList<String> common= new ArrayList<>();

        for(String a1:arr1){
            for (String a2:arr2){
                if(a1.equals(a2) && !common.contains(a1)){
                    common.add(a1);
                }
            }
        }
        System.out.println("The final common elements in both arrays are: ");
        for (String c: common){
            System.out.println(c);
        }
    }
}
