public class PaymentDetails {
    public static void main(String[] args){
        Payments p = new CreditCardPayment();
        p.pay(500);
        Payments p2 = new CashPayment();
        p2.pay(500);
        Payments p3 = new UPIpayment();
        p3.pay(500);
    }
}
