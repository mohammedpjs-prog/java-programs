public class program22 {
        public static int sumFirstAndLastDigit(int number){

            // convert negative to positive
            number = Math.abs(number);

            int lastDigit = number % 10;

            while(number >= 10){
                number = number / 10;
            }

            int firstDigit = number;

            return firstDigit + lastDigit;
        }

        public static void main(String[] args){
            System.out.println(sumFirstAndLastDigit(-123));
            System.out.println(sumFirstAndLastDigit(-98));// test
        }
    }