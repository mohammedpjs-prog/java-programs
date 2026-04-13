public class program44 {
    public static int getevensumdigit(int num){
        if (num < 0){
            return -1;
        }
        int sum = 0;
        for (int i = num; i >0; i/=10){
            int lastdigit = i % 10;
            if (lastdigit %2==0){
                sum+=lastdigit;

            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(getevensumdigit(98));
        System.out.println(getevensumdigit(88));
        System.out.println(getevensumdigit(864246810));
    }
}
