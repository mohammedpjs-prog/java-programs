import java.util.Scanner;
public class program63 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter country (default : india ) ");
        String country = sc.nextLine();

        if (country.isEmpty()){
            country = "india";

        }
        System.out.println(" Country : "+ country);
        sc.close();

    }
}
