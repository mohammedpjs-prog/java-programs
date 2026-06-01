package DateandTimeExamples;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class CurrentDate {
    public static void main(String[] args){
        LocalDate today  = LocalDate.now();
        System.out.println(today);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime DT = LocalDateTime.now();
        System.out.println(DT);
    }
}
