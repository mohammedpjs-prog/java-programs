public class Bankingsystem {
    double amount;
     void deposit(double amount){
        System.out.println(" Deposite Done ");
    }
}
class SavingAC extends Bankingsystem{
    void CreateSA(){
        System.out.println(" Account was created ");
    }
}
class CurrentAC extends Bankingsystem{
    void CreateCA(){
        System.out.println(" Account was created ");
    }
}
