package DateandTimeExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeformat {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm-ss");
        String formatted = now.format(formatter);
        System.out.println(formatted);
    }
}
