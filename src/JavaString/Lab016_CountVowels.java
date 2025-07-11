package JavaString;

public class Lab016_CountVowels {
    public static void main(String[] args) {
        char[] ch= {'a','e','i','o','u','A','E','I','O','U'};
        String name="Ashwini";
        int count=0;
        for(int i=0;i<name.length();i++){
            char c= name.charAt(i);
        for(int j=0;j<ch.length;j++) {
            if (ch[j] == c) {
                count++;
                break;
            }
        }

        }
        System.out.println("Number of vowels in " + name + ": " + count);
        }

}
