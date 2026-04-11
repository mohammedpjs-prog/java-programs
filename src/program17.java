public class program17 {
    public static int monthdays(int mon, int year) {
        if (year < 1 || year > 9_999) {
            return -1;
        }
        return switch (mon) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isleapyear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> -1;

        };
    }
    public static boolean isleapyear(int year){
        if (year < 1 || year > 9_999){
            return false;
        }
        if (year % 4 == 0){
            if (year % 100 != 0){
                return true;
            }else {
                if (year % 400 !=0){
                    return true;
                }else {
                    return false;
                }
            }
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isleapyear(2028));
        System.out.println(monthdays(10,2046));
        for (int n = 100; n <=200; n+=20){
            System.out.println(n);
        }
    }
}