public class Bankaccount {
    private double balance;

    public void deposite(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public double getbalance(){
        return balance;
    }
}
