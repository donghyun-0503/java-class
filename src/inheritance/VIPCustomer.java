package inheritance;

public class VIPCustomer extends Customer {

    private int agentId;
    double saleRatio;


    public VIPCustomer(int customerID, String customerName, int agentId) {
        super(customerID, customerName);
        saleRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";
        System.out.println("하위 클래스 VIPCustomer(int, String) 생성자 호출");
    }

    public int getAgentId() {
        return agentId;
    }

    public String showVIPInfo() {
        return super.showCustomerInfo() + "\n담당 상담원 아이디는 " + agentId + "입니다.";
    }
}
