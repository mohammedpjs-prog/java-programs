import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args){
        int [] arr = { 5,4,6,8,};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 6);

        System.out.println("Index: " + index);
    }
}
