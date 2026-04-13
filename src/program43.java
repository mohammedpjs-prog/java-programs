public class program43 {
    public static int sumoffirstandlastdigit(int num) {
        if (num < 0) {
            return -1;
        }
        int lastdigit = num % 10;

        while (num >= 10) {
            num = num / 10;
        }

            int firstdigit = num;
            int sum = firstdigit + lastdigit;


        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumoffirstandlastdigit(987));
        System.out.println(sumoffirstandlastdigit(88));
        System.out.println(sumoffirstandlastdigit(-93));
    }

}
