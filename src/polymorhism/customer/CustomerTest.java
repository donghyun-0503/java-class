package polymorhism.customer;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.customerID = 10010;
        customerLee.customerName = "이순신";
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());
        System.out.println();

        Customer customerKim = new VIPCustomer(20010, "김유신", 1001);
        customerKim.bonusPoint = 10000;

        System.out.println(customerKim.showCustomerInfo());

        System.out.println("=====할인율과 포인트 계산=====");

        int price = 40000;
        int leePrice = customerLee.calcPrice(price);
        int kimPrice = customerKim.calcPrice(price);

        System.out.println(customerLee.customerName + "님이 " + leePrice + "원 지불하셨습니다.");
        System.out.println(customerLee.showCustomerInfo());
        System.out.println();
        System.out.println(customerKim.customerName + "님이 " + kimPrice + "원이 지불하셨습니다.");
        System.out.println(customerKim.showCustomerInfo());
    }
}
