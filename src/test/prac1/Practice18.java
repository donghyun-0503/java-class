package test.prac1;

public class Practice18 {

    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 99;
        int num3 = 77;
        int max = 0;

        int[] maxArr = {num1, num2, num3};

        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] > max) {
                max = maxArr[i];
            }
        }

        System.out.println(max);
    }
}
