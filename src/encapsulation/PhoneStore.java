package encapsulation;

public class PhoneStore {

    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone  = phone;
    }

    public Phone sellPhone(String model, double budget) {
        String phoneModel = phone.getModel();

        if (model.equals(phoneModel) && budget >= phone.getPrice()) {
            registerPayment();
            discountPromotion();
            saveData();
            return phone;
        }
        else return null;
    }

    private void registerPayment() {
        System.out.println();
    }

    private void saveData() {
        System.out.println();
    }

    private void discountPromotion() {
        System.out.println();
    }
}
