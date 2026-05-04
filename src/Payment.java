public interface Payment {
    void Pay(double amount);

}
class Creditcard implements Payment{
    public void Pay(double amount){
        System.out.println(" Paid " + amount + " using creditcard. ");
    }
}
class UPI implements  Payment{
    public void Pay(double amount){
        System.out.println(" Paid " + amount + " using UPI. ");
    }
}
class Cash implements Payment{
    public void Pay(double amount){
        System.out.println(" Paid "+ amount + " usind cash. ");
    }
}