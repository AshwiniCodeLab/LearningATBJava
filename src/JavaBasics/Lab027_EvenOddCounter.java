package JavaBasics;
// Use Case: Find how many even or odd IDs are present in invoices.
public class Lab027_EvenOddCounter {
    public static void main(String[] args) {
        int[] invoices={11,12,13,14,15,16,17,18,24,23,22};
        int even=0,odd=0;
        for(int count: invoices){
            if(count%2==0){
               even++;
            }else {
                odd++;
            }
        }
        System.out.println("The total even id's are: "+even+" and odd id's are: "+odd);
    }
}
