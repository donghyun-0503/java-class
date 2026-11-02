package test2;

public class Order {

    private String oName;
    private Product product;
    private int num;
    private static int oNo = 1000;

    public Order(String oName, Product product, int num) {
        this.oName = oName;
        this.product = product;
        this.num = num;
        this.oNo++;
    }

    public int getTotalPrice() {
        return product.getPrice() * num;
    }

    public void processOrder() {
        if (product.getStock() >= num) {
            product.reduceStock(num);
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    public void showInfo() {
        System.out.println("주문자 이름: " + oName);
        System.out.println("주문 번호: " + oNo);
        System.out.println("주문 상품명: " + product.getPName());
        System.out.println("주문 수량: " + num);
        System.out.println("주문 금액: " + getTotalPrice() + "원");
    }
}
