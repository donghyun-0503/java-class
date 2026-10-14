package array;

public class Student {

    private String studentName;
    private int score;

    public Student() {}

    public Student(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println(studentName + ", " + score);
    }
}
