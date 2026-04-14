import java.util.Scanner;
public class program57 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a number :");
        if (sc.hasNextInt()){
           int num = sc.nextInt();
            System.out.println(" Valid number ");

        }else {
            System.out.println(" invalid number :");
        }

    }
}
