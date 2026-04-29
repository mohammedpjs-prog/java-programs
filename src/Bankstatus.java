public class Bankstatus {
    public static void main(String[] args){
        SavingAC s = new SavingAC();
        s.CreateSA();
        s.deposit(1000.0);

        CurrentAC c = new CurrentAC();
        c.CreateCA();
        c.deposit(1000.0);
    }
}
