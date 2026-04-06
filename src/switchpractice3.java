public class switchpractice3 {
    public static void main(String[] args){
        printdayofweek(0);
    }
    public static void printdayofweek(int day){
        String dayofweek = switch (day) {
            case 0 -> {yield "sunday";}
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> "invalid day";
        };
        System.out.println(day + " stands for " + dayofweek);

    }

    public static void printweekday(int day){
        String dayofweek = "invalid day";
        if (day == 0){
            dayofweek = "sunday";
        } else if (day == 1) {
            dayofweek = "monday";
        }  else if (day == 2 ) {
            dayofweek = "tuesday";
        } else if (day == 3) {
            dayofweek = "wednesday";
        } else if (day == 4) {
            dayofweek = "thursdat";
        } else if (day== 5) {
            dayofweek = "fridat";
        } else if (day == 6) {
            dayofweek = "saturday";
        }
        System.out.println(day + " stands for " + dayofweek);
    }
}
