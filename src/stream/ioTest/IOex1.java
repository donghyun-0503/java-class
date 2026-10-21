package stream.ioTest;

import java.util.Scanner;

public class IOex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += scanner.nextInt();
        }

        double avg = (double) sum / 10;

        System.out.println("합: " + sum);
        System.out.printf("평균: %.1f", avg);
    }
}
