package test2;

public class Product {

    private int pNo;
    private String pName;
    private int price;
    private int stock;

    public Product(int pNo, String pName, int price, int stock) {
        this.pNo = pNo;
        this.pName = pName;
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public String getPName() {
        return pName;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int num) {
        this.stock -= num;
    }

    public void showInfor() {
        System.out.println("상품 번호: " + pNo);
        System.out.println("상품명: " + pName);
        System.out.println("상품 가격(원): " + price);
        System.out.println("재고 수량: " + stock);
    }
}
