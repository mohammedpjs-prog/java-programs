public class program37 {
    public static void sumeven(int a ){
        int sum = 0;
        for (int i = 1; i <= a; i++){
            if (i % 2 ==0){
                sum+=i;
                
            }
            System.out.println(" sum of even numbers are = "+ sum);
        }

    }
    public static void main(String[] args){
        sumeven(10);
    }
}
