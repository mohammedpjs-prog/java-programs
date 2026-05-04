public class CrateingBankAccount {
    private String accountholder;
    private double balance;


    public CrateingBankAccount(String name, double balance){
        this.accountholder=name;
        if (balance >=0){
            this.balance=balance;

        }
    }
    public void deposite(double amount){
        if (amount > 0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance-=amount;
        }else {
            System.out.println(" Invalid amount ");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        CrateingBankAccount c = new CrateingBankAccount("rahil",1000.00);
        c.deposite(500);
        c.withdraw(300);


        System.out.println(" Balance : " + c.getBalance());

    }
}
