public class BANK {
    private String name;
    private double balance;

    public void deposite(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance-= amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
