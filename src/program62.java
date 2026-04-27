import java.util.Scanner;
public class program62 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;

        while (true){
            System.out.println(" Enter your age : ");
            try {
                age = Integer.parseInt(sc.nextLine());
                if(age > 0 )break;
                System.out.println(" age must be positive ");

            }catch (Exception e ){
                System.out.println("invalid input ,enter number ;");

            }

        }
        System.out.println("your age is : "+ age);
        sc.close();
    }
}
