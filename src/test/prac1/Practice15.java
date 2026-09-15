package test.prac1;

public class Practice15 {

    public static void main(String[] args) {
        char[] decode = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 's', 'p', 'y'};

        char[] encode = new char[decode.length];

        for (int i = 0; i < decode.length; i++) {
            encode[i] = decode[decode.length - 1 - i];
        }

        for (int i = 0; i < encode.length; i++) {
            System.out.print(encode[i]);
        }
    }
}
