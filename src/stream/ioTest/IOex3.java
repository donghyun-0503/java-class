package stream.ioTest;

import java.util.Scanner;

public class IOex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";

        for (int i = 0; i < 10; i++) {
            char ch = sc.next().charAt(0);
            result += ch;
        }

        System.out.println(result);
        sc.close();
    }
}
