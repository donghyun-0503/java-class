package test2;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        Student studentLee = new Student(1101, "김철수", 1, "공통과");
        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();
        scanner.nextLine();
        String major = scanner.nextLine();

        studentLee.setGrade(grade);
        studentLee.setMajor(major);

        System.out.println("=== 진급 후 ===");
        studentLee.showInfo();
    }
}
