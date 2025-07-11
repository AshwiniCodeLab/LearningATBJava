package JavaString;

public class Lab015_TocharArray {
    public static void main(String[] args) {
        String name = "Swami";
        char[] ch = name.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }

        System.out.println("Reverse by using char array");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println("Reverse by using charta index");
        for (int j = name.length() - 1; j >= 0; j--) {
            System.out.print(name.charAt(j));
        }
    }
}
