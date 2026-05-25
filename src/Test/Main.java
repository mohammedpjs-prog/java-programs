package Test;

public class Main {
    public static void main(String[] args){
        Runnable r = ()->{
            System.out.println("Thread is running...");
        };
        new Thread(r).start();
    }
}
