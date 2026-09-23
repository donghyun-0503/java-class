package e;

public class Student {

    public static int num = 1;
    private int id;
    private String name;

    public Student() {}

    public Student(String name) {
        this.name = name;
        this.id = num;
        num++;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void studentInfo() {
        System.out.println(id + " " + name);
    }
}
