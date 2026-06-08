package SreamePractice;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DeleteDplcts {
    public static void main(String[] args){
        List<Integer>number=
                Arrays.asList(1,1,1,2,3,4,5,5,6,67,7,8,8,9,90,0);
        List<Integer>res = number.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
