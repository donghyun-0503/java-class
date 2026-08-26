package loop;

public class WhileEx1 {

    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num; // 1 > 3 > 6 > 10 > 15 > 21 > 28 > 36 > 45 > 55
            num++; // 2 > 3 > 4 > 5 > 6 > 7 > 8 > 9 > 10 > 11
        }

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
        System.out.println("num값은 " + num + "입니다.");
    }
}
