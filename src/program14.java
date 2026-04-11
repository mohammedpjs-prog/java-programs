public class program14 {
    public static final int MIN_PER_HOUR = 60;
    public static final int HOURS_PER_DAY = 24;
    public static final int DAYS_PER_YEAR = 365;
    private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
    private static final int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
    public static void  printyearsanddays(long min) {
        if (min < 0) {
            System.out.println(" invalid value ");
            return;
        }
        long years = min / MIN_PER_YEAR;
        long days = (min / MIN_PER_DAY) % DAYS_PER_YEAR;
        System.out.println(min + " min = " + years + " y and " + days + " d");

    }
    public static void main(String[] args){
        printyearsanddays(234567834);
        printyearsanddays(1234);
        printyearsanddays(12345);
        printyearsanddays(1234567);
    }
}
