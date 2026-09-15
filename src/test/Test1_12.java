package test;

public class Test1_12 {

    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            if (i % 7 == 0 && i % 9 == 0) {
                System.out.println(i);
            }
        }
    }
}
