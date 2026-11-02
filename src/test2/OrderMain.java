package test2;

import java.util.Scanner;

public class OrderMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product mouse = new Product(101, "마우스", 5000, 100);

        String name = scanner.nextLine();
        int num = scanner.nextInt();

        Order orderLee = new Order(name, mouse, num);
        System.out.println("==주문 결과==");
        orderLee.processOrder();

        System.out.println("\n==주문 후 상품 정보==");
        mouse.showInfor();
    }
}
