import java.util.Scanner;
public class program56 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Are you  a student? (true / false): ");
        boolean isstudent = sc.hasNextBoolean();

        if (isstudent){
            System.out.println(" you are eligible for student discount ");

        }else {
            System.out.println(" you are not eligible for discount");
        }
    }
}
