public class ACCdetails {
    public static void main(String[] args){
        Creatingbankacc c= new Creatingbankacc();
        Creatingbankacc c1 =new Creatingbankacc("Rahul");
        Creatingbankacc c2 = new Creatingbankacc("AAA",12345678);
        Creatingbankacc c3 = new Creatingbankacc("BBB",876543321,10000.0);
        c.display();
        c1.display();
        c2.display();
        c3.display();

    }
}
