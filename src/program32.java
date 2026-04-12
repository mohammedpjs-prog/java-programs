public class program32 {
    public static void num(int a){
        int count = 0;
        for (int i = 1; i<=a; i++){
            if (i % 3 ==0){
                count++;
            }
        }
        System.out.println(" total numbers divisible by 3 = "+count);
    }
    public static void main(String[] args){
        num(76);
        num(10);
    }
}
