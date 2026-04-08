public class program11 {
    public static boolean hasteem( int a, int b, int c){
        return isteen(a)|| isteen(b)||isteen(c);
    }
    public static boolean isteen(int num){
        return num > 12 && num < 20;
    }
    public static void main(String[] args){
        System.out.println(isteen(33));
        System.out.println(hasteem(55,13,19));
    }
}
