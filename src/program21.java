public class program21 {
    public static boolean isPalindrome(int number){//correct

        int reverse = 0; // correct
        int originalNumber = number;

        while(number != 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;

        }

        return originalNumber == reverse;

    }
    public static void main(String[] args){
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(9333));
        System.out.println(isPalindrome(84545));
        System.out.println(isPalindrome(76767));
        System.out.println(isPalindrome(61234332));
        System.out.println(isPalindrome(512345566));
        System.out.println(isPalindrome(409876));
        System.out.println(isPalindrome(345678));





    }

}
