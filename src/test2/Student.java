package test2;

public class Student {

    int sID ;
    String sName;
    int grade;
    String major;

    public Student(int sID, String sName, int grade, String major) {
        this.sID = sID;
        this.sName = sName;
        this.grade = grade;
        this.major = major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void showInfo() {
        System.out.println(sID + sName + grade + major);
    }
}
