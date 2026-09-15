package test;

public class Test1_19 {

    public static void main(String[] args) {
        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('Z' - i);
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]);
        }
    }
}
