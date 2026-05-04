public class CheckPayment {
    public static void main(String[] args){
        Payment p;
        p = new Creditcard();
        p.Pay(2000.0);
        p=new UPI();
        p.Pay(2000.0);
        p=new Cash();
        p.Pay(2000.0);
    }

}
