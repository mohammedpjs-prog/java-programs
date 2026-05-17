public class WeekUpdates {
    enum Week {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
    }
    public static void main(String[] args){
        Week w = Week.MONDAY;
        Week w1 = Week.TUESDAY;
        Week w2 = Week.WEDNESDAY;

        switch (w){
            case MONDAY -> System.out.println("Start of the week");
            case TUESDAY -> System.out.println("Second day ");
            case WEDNESDAY -> System.out.println(" Mid week ");
        }
        switch (w1){
            case MONDAY -> System.out.println("Start of the week");
            case TUESDAY -> System.out.println("Second day ");
            case WEDNESDAY -> System.out.println(" Mid week ");
        }
        switch (w2){
            case MONDAY -> System.out.println("Start of the week");
            case TUESDAY -> System.out.println("Second day ");
            case WEDNESDAY -> System.out.println(" Mid week ");

        }
        System.out.println("----------");
        Week [] day = Week.values();
        for (Week d : day){
            System.out.println(d);
        }
        System.out.println("----------");
        System.out.println(Week.MONDAY.ordinal());
        System.out.println(Week.TUESDAY.ordinal());
        System.out.println(Week.WEDNESDAY.ordinal());

    }
}
