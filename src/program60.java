import java.util.Scanner;
public class program60 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number : ");
        int a = sc.nextInt();

        System.out.println(" Enter second numbers : ");
        int b = sc.nextInt();


        System.out.println(" sum = " + (a + b));
        System.out.println(" diff = " + (a - b));
        System.out.println(" product = "+(a* b));
        System.out.println(" divide = "+ (a/b));
    }
}
