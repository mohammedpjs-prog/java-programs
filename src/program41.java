public class program41 {
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
         
    }

}
