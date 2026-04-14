import java.util.Scanner;
public class program55 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter first word :");
        String word1 = sc.next();

        sc.nextLine();

        System.out.println(" Enter full sentence :");
        String sentence = sc.nextLine();
        System.out.println(" This is only one word " + word1);
        System.out.println(" This is sentence " + sentence);
    }
}
