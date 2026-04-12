public class program29 {
    public static void sumnum(int a){
        int sum = 0;

        for (int i = 1; i<=a; i ++){
            sum +=i;
        }
        System.out.println("sum "+ sum);
    }
    public static void main(String[] args){
        sumnum(8);
    }


}
