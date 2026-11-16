package polymorhism.customer;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        initCustomer();
//        System.out.println("상위 클래스 Customer() 생성자 호출");
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
        System.out.println("상위 클래스 Customer(int, String) 생성자 호출");
    }

    public int calcPrice(int price) {
        bonusPoint += (int) (price * bonusRatio);
        return price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    private void initCustomer() {
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }
}
