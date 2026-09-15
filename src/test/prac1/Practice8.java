package test.prac1;

public class Practice8 {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                if (i % 2 == 0) {
                    num = i * 5 + j + 1;
                } else {
                    num = i * 5 + (5 - j);
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
