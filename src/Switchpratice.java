public class Switchpratice {
    public static void main(String[] args){
        int day = 9;
        String result = switch (day){
            case 1 -> "monday;";
            case 2 -> "tuesday";
            default -> "invalid";
        };
        System.out.println(result);

    }
}
