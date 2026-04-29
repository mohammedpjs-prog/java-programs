public class Checkworkflow {
    public static void main(String[] args){
       Developer d = new Developer();
       d.work();
       d.code();
       d.test();


       Tester t = new Tester();
       t.Test();
       t.work();

    }
}
