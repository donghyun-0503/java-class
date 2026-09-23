package e;

public class Test {

    public static void main(String[] args) {
        // 학생 추가
        Student s1 = new Student("권");
        Student s2 = new Student("김");
        Student s3 = new Student("이");

        // 학번 출력
        s1.studentInfo();
        s2.studentInfo();
        s3.studentInfo();
    }
}
