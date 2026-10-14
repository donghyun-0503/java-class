package array.studentList;

import java.util.ArrayList;

public class StudentList {

    public static void main(String[] args) {
        String[] name = {"강하늘", "김도영", "박영현", "안세영", "우상혁", "최인호"};

        int i = 1101;

        ArrayList<Student> list = new ArrayList<Student>();

        for (int j = 0; j < name.length; j++) {
            list.add(new Student(j++, name[j]));
        }

        for (Student s : list) {
            System.out.println("학번: " + s.getStudentId() + ", 이름: " + s.getName());
        }
    }

}
