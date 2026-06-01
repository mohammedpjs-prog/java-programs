package FunctionalInterfaces;

public class TestConsumer {
    public static void main(String[] args){
        Consumer<String>print = name -> System.out.println(name);
        print.accept("Rahil");
    }
}
