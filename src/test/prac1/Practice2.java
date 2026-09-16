package test.prac1;

public class Practice2 {

    public static void main(String[] args) {
        int score = 86;
        System.out.println("점수: " + score);
        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "등급: A";
                break;
            case 8:
                grade = "등급: B";
                break;
            case 7:
                grade = "등급: C";
                break;
            default:
                grade = "등급: D";
                break;
        }

        System.out.println(grade);
    }
}
