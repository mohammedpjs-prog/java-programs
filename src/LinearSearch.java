import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int [] arr = { 4,5,45,6,7,8,2,};
        int key =7;
        boolean found = false;
        for (int i = 0;i< arr.length;i++){
            if (arr[i]==key){
                break;
            }
        }
        if (found){
            System.out.println(" Found element ");
        }else {
            System.out.println(" Not found ");

            int index = Arrays.binarySearch(arr,6);

            System.out.println(" Index : " + index);
        }
    }
}
