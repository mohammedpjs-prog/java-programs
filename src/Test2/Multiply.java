package Test2;

public class Multiply {
    public static void main(String[] args){
        Calculator c = (a,b)->{
            System.out.println("Multiplying...");
            return a*b;
        };
        System.out.println(c.multiply(5,6));
    }

}
