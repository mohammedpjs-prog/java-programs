public class program20 {
    public static void main(String[] args){
        int a = 4;
        int b = 20;
        while (a <= b){
            if (iseven(a)) {
                System.out.println("even number is " + a);
            }
            a++;
        }
    }
    public static boolean iseven(int num){
        if ((num % 2)==0){
            return true;
        }else {
            return false;
        }
    }
}
