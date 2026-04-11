public class program15 {
    public static boolean iscatplaying(boolean summer, int temp){
        int max = summer ? 45 : 35;
        return temp >= 25 && temp <= max;

    }
    public static void main(String[] args){
        System.out.println(iscatplaying(true,46));
        System.out.println(iscatplaying(false,44));
        System.out.println(iscatplaying(true, 33));
    }
}
