package ArrayPractice;
import java.util.Arrays;
public class FindMaximumNumber {
    public static void main(String[] args){
        int [] arr = {10,25,67,90};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < max)
                max = arr[i];
        }
        System.out.println("Maximum="+max);
    }
}
