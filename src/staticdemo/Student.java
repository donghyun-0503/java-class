package staticdemo;

public class Student {

    // public static int serialNum = 1000;
    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
