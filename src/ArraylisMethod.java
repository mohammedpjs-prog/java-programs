import java.util.ArrayList;
import java.util.Collections;
public class ArraylisMethod {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(90);
        numbers.add(10);
        //Sorting
        Collections.sort(numbers);
        System.out.println(numbers);
        //Reversing
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
        //Seraching
        System.out.println(numbers.contains(50));

        //Index
        System.out.println(numbers.indexOf(10));
        ArrayList<Integer>nums = new ArrayList<>();
        nums.addAll(numbers);
        System.out.println(nums);
        //Sorting
        Collections.sort(numbers);
        System.out.println(numbers);
        //Reversing
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
        //Seraching
        System.out.println(numbers.contains(50));

        //Index
        System.out.println(numbers.indexOf(10));



    }
}
