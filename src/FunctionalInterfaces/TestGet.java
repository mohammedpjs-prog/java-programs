package FunctionalInterfaces;

public class TestGet {
    public static void main(String[] args){
        Supplier<String> msg = ()->"Good evening!";
        System.out.println(msg.get());
    }
}
