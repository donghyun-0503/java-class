package test2;

import java.util.Scanner;

public class LibraryMemberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();

        LibraryMember libraryMember1 = new LibraryMember(name1);
        LibraryMember libraryMember2 = new LibraryMember(name2);
        LibraryMember libraryMember3 = new LibraryMember(name3);

        libraryMember1.showInfo();
        libraryMember2.showInfo();
        libraryMember3.showInfo();

        System.out.println("전체 회원 수: " + LibraryMember.getMemberCount() + "명");
    }
}
