package polymorhism.customer;

import java.util.ArrayList;

public class CustomerTest2 {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerA = new Customer(10010, "이순신");
        Customer customerB = new Customer(10011, "홍길동");
        Customer customerC = new GoldCustomer(10012, "장보고");
        Customer customerD = new GoldCustomer(10013, "김유신");
        Customer customerE = new VIPCustomer(10014, "김홍도", 1002);

        customerList.add(customerA);
        customerList.add(customerB);
        customerList.add(customerC);
        customerList.add(customerD);
        customerList.add(customerE);

        System.out.println("===고객 정보 출력===");
        int price = 1000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불했습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는  " + customer.getBonusPoint() + "입니다.");
        }
    }
}
