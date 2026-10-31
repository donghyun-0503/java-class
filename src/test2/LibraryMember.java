package test2;

public class LibraryMember {

    private int memberId;
    private String name;
    private static int serialNum = 1000;

    public LibraryMember(String name) {
        this.memberId = ++serialNum;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("회원 번호: " + memberId + ", 이름: " + name);
    }

    public static int getMemberCount() {
        return serialNum - 1000;
    }
}
