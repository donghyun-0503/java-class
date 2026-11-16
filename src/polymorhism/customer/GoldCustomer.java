package polymorhism.customer;

public class GoldCustomer extends Customer {

    protected double saleRate;

    public GoldCustomer() {
        super();
        initGoldCustomer();
    }

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        initGoldCustomer();
    }

    public void initGoldCustomer() {
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRate = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += (int) (price * bonusRatio);
        return price - (int) (price * saleRate);
    }
}
