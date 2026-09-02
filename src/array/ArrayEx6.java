package array;

public class ArrayEx6 {

    public static void main(String[] args) {
        int[][] score = new int[][] {{89, 76, 100, 68, 48, 98, 56, 77, 95}, {50, 60, 70, 100, 99, 88, 83, 78, 93}};
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                if (i == 0) {
                    sum1 += score[i][j];
                } else {
                    sum2 += score[i][j];
                }
            }
        }

        double avg1 = (double) sum1 / score[0].length;
        double avg2 = (double) sum2 / score[1].length;

        System.out.printf("A반 평균: %.1f\n", avg1);
        System.out.printf("B반 평균: %.1f", avg2);
    }
}
