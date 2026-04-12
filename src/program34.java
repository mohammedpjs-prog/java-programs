public class program34 {
    public static void numbers(int a){
        while (a > 0){
            int digit = a %10;
            System.out.println(digit);
            a = a/10;
        }
    }
    public static void main(String[] args){
        numbers(23213);
    }
}
