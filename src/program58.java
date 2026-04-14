import java.util.Scanner;
public class program58 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter words ( type 'stop' to end )");
        System.out.println(" you entered");
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("stop")) {
                break;
            }
            System.out.print(input+" ");
        }
    }
}
