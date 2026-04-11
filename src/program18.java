public class program18 {
    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        if (start < 0 || end < 0 || end < start) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        String s1 = "java";
        String s2 = new String("java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(isOdd(4));
        System.out.println(sumOdd(88,22));
        System.out.println(sumOdd(55,77));
    }
}
