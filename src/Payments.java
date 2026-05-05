public interface Payments {
    void pay(double payment);

}
class CreditCardPayment implements Payments{
    public void pay(double amount){
        System.out.println(" Paid " +amount+" with credit card. ");
    }
}
class UPIpayment implements Payments{
    public void pay(double amount){
        System.out.println(" Paid " + amount + " using UPI. ");
    }
}
class CashPayment implements Payments{
    @Override
    public void pay(double amount) {
        System.out.println(" Paid " + amount  + " using cash.");
    }
}