public class PaymentAdapter implements NewPaymentMethod {
    private OldPaymentMethod oldPaymentMethod;

    public PaymentAdapter(OldPaymentMethod oldPaymentMethod) {
        this.oldPaymentMethod = oldPaymentMethod;
    }

    @Override
    public void pay(double amount) {
        // Adapting the old payment method to the new interface
        oldPaymentMethod.makePayment(amount);
    }

}
