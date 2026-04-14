import java.util.Scanner;
public class program54 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your age ;");
        int age = sc.nextInt();

        System.out.println(" Enter your height :");
        double height = sc.nextDouble();

        sc.nextLine();

        System.out.println(" Enter youe name :");
        String name = sc.nextLine();
        System.out.println(" Your are " + age + " years old and height is " + height + " 'm tall." +" Your name is " + name);
    }
}
