public class program42 {
    public static boolean ispalindrome(int num){
        int reverse = 0;
        int originum = num;
        while (num !=0){
            int lastdigit = num % 10;
            reverse = (reverse * 10)+lastdigit;
            num = num/10;

        }
        return originum==reverse;
    }
    public static void main(String[] args){
        System.out.println(ispalindrome(99));
    }
}
