package test2;

public class BankAccount {

    String accountNumber;
    String name;
    int balance;

    public BankAccount(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }

    public void transfer(BankAccount target, int money) {
        if (balance - money >= 0) {
            withdraw(money);
            target.deposit(money);
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }

    public void showInfo() {
        System.out.println(name + "의 계좌번호: " + accountNumber + "잔액: " + balance + "원");
    }
}
