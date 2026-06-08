package ArrayList;

public class Programm76 {
    public static void main(String[] args){
        try {
            int a = 1000 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("This always runs");
        }
    }
}
