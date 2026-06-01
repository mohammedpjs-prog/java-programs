package ArrayPractice;

public class CountEvenNumbers {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,10};

        int count = 0;
        for (int num: arr){
            if (num % 2 == 0){
                System.out.println(num);
                count++;
            }
        }
        System.out.println(count);
    }
}
