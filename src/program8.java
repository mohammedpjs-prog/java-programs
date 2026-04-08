public class program8 {
    public static boolean isLeapYear(int year){

        if(year < 1 || year > 9_999){
            return false;
        }

        if(year % 4 == 0){

            if (year % 100 != 0){
                return true;
            }
            else {
                if(year  % 400 == 0){
                    return true;


                }
                else{

                    return false;
                }

            }

        }
        else {
            return false;
        }}
    public static void main(String[] args){
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(2026));
        System.out.println(isLeapYear(2027));
        System.out.println(isLeapYear(2028));
    }
}