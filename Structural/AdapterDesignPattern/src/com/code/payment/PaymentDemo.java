public class PaymentDemo {
    public static void main(String[] args) {
        OldPaymentMethod oldPayment = new OldPaymentMethod();
        NewPaymentMethod paymentAdapter = new PaymentAdapter(oldPayment);

        // Using the new payment method interface to make a payment
        paymentAdapter.pay(100.0);
    }
}
