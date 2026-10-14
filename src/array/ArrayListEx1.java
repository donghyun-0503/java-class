package array;

import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("가", 100));
        students.add(new Student("나", 90));
        students.add(new Student("다", 80));
        students.add(new Student("라", 70));
        students.add(new Student("마", 60));

        for (Student student : students) {
            student.showInfo();
        }
    }
}
