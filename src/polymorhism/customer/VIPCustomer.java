package polymorhism.customer;

public class VIPCustomer extends Customer {

    private int agentId;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentId) {
        super(customerID, customerName);
        this.agentId = agentId;
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += (int) (price * bonusRatio);
        return price - (int) (price * saleRatio);
    }

    public int getAgentId() {
        return agentId;
    }

    public String showVIPInfo() {
        return super.showCustomerInfo() + "\n담당 상담원 아이디는 " + agentId + "입니다.";
    }
}
