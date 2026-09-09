package reference;

public class Student {
    int studentID;
    String studentName;
    Subject korean;
    Subject math;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        korean = new Subject();
        math = new Subject();
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 " + korean.getSubjectName() + " 과목의 점수는 " + korean.getScorePoint() + "점이며 " + math.getSubjectName() + " 과목의 점수는 " + math.getScorePoint() + "점입니다.");
    }

    public void setKoreanSubject(String subjectName, int score) {
        korean.setSubjectName(subjectName);
        korean.setScorePoint(score);
    }

    public void setMathSubject(String subjectName, int score) {
        math.setSubjectName(subjectName);
        math.setScorePoint(score);
    }
}
