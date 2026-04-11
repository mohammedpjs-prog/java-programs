public class program19 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <=50; i++) {
            if (iswholenum(i)) {
                System.out.println("number " + i + " is a prime number ");
                count++;
            }
        }
        System.out.println(" total number of prime numbers between 10 and 50 are " + count);
    }
    public static boolean iswholenum(int wholenum) {
        if (wholenum <= 2) {
            return (wholenum == 2);
        }
        for (int div = 2 ; div < wholenum;div++){
            if (wholenum % div ==0){
                return false;
            }
        }
        return true;
    }
}

