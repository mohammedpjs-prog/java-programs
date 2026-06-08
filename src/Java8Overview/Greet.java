package Java8Overview;

public class Greet {
    public static void main(String[] args){
        Greeting g = ()-> System.out.println("hello");
        g.sayHello();

    }
}
