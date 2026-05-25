package Test2;

public class Greet {
    public static void main(String[] args){
        Message m = ()-> "Welcome to java 8";
        System.out.println(m.greet());
    }
}
