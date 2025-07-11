package JavaString;

public class Lab017_Palindrome {
    public static void main(String[] args) {
        String original="Madam";
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse+=original.charAt(i);
        }
        System.out.println("The original string is: "+original);
        System.out.println("The reverse string is: "+reverse);
        if(original.equalsIgnoreCase(reverse)){
            System.out.println("The given String is palindrome.");
        }else {
            System.out.println("The given string is not palindrome.");
        }

    }
}
