import java.util.Scanner;
public class program64 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String savedname= "Tom";
        int savepass = 1234;

        System.out.println(" Enter your name :");
        String name = sc.nextLine();

        int attempt = 3;
        boolean succsess = false;


        while (attempt >0) {
            System.out.println(" Enter password : ");
            int pass = sc.nextInt();
            int compass = sc.nextInt();
            if(name == savedname && compass == savepass){
                System.out.println(" Welcome back ");
                succsess = true;
                break;
            }else {
                attempt--;
                System.out.println(" wrong user name and pass");
            }
        }
        System.out.println(" welcome back ");
        sc.close();
    }
}
