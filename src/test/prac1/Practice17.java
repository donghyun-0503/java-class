package test.prac1;

public class Practice17 {

    public static void main(String[] args) {
        int[][] score = {
                {80, 90, 100},
                {74, 100, 88},
                {65, 77, 90},
                {45, 76, 82},
                {98, 100, 92}
        };

        String[] subName = {"국어", "영어", "수학"};

        for (int j = 0; j < subName.length; j++) {
            int sum = 0;
            for (int i = 0; i < score.length; i++) {
                sum += score[i][j];
            }
            double avg = (double) sum / score.length;
            System.out.println(subName[j] + ": " + avg);
        }
    }
}
