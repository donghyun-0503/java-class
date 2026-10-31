package stream.ioTest;

import java.util.Scanner;

public class IOex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tree = scanner.nextInt();

        for (int i = 1; i <= tree; i++) {
            for (int j = 1; j <= tree - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}