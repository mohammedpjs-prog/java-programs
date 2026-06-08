package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30000),
                new Employee("Ahmed", 60000),
                new Employee("John", 45000),
                new Employee("Aisha", 70000)
        );
        List<Employee> result =
                employees.stream()
                        .filter(e -> e.getSalary() > 50000)
                        .collect(Collectors.toList());
        System.out.println(result);
    }
}
