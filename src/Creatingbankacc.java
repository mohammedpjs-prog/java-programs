public class Creatingbankacc {
    private String name;
    private long accno;
    private double balance;

    Creatingbankacc(){
        this(" unknown", 0, 0.0);
    }
    Creatingbankacc(String name){
     this(name,1000000000, 0.0);
    }
    Creatingbankacc(String name, long accno){
        this(name,accno,1000.0);
    }
    Creatingbankacc(String name, long accno, double balance){
        this.name=name;
        this.accno=accno;
        this.balance=balance;
    }
    void display(){
        System.out.println(name+" "+accno+" "+balance);
    }
}
