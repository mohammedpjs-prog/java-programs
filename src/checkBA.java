public class checkBA {
    public static void main(String[] args){
        Bankaccount BKA = new Bankaccount();
        BKA.deposite(10000);
        System.out.println(BKA.getbalance());
    }
}
