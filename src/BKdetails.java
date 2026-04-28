public class BKdetails {
    public static void main(String[] args){
        BANK b = new BANK();
        b.deposite(10000);
        b.withdraw(5000);
        b.withdraw(1000);
        b.deposite(10000);
        System.out.println(" Your bank balane is : " + b.getBalance());
    }
}
