package test2;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount accountLee = new BankAccount("101-1234-5678", "이순신", 100000);
        BankAccount accountKim = new BankAccount("101-5678-1234", "김용식", 200000);
        BankAccount accountAhn = new BankAccount("101-7485-9632", "안중근", 300000);

        System.out.println("이체할 대상과 금액을 입력하세요.(김용식: 1, 안중근: 2)");

        int num = scanner.nextInt();
        int money = scanner.nextInt();

        if (num == 1) {
            accountLee.transfer(accountKim, money);
        } else if (num == 2) {
            accountLee.transfer(accountAhn, money);
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.");
        }

        accountLee.showInfo();
        accountKim.showInfo();
        accountAhn.showInfo();
    }
}
