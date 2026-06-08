package Java8Overview;

public class Numbers {
    public static void main(String[] args){
        PrintNumbers p = ()->{
            for (int i = 1;i <= 10;i++){
                System.out.println(i);
            }
        };
        p.Print();
    }
}
