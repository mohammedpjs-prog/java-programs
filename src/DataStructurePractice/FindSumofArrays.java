package DataStructurePractice;

public class FindSumofArrays {
    static int add() {
        int[] arr = {12, 34, 56, 78, 90};
        int sum = 0;
        for (int num : arr) {
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args){
        FindSumofArrays fa = new FindSumofArrays();
        System.out.println(fa.add());
    }
}
