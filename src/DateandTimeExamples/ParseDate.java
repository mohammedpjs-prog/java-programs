package DateandTimeExamples;
 import java.time.LocalDate;
public class ParseDate {
    public static void main(String[] args){
        LocalDate date = LocalDate.parse("2026-05-01");
        System.out.println(date);
    }
}
