import java.util.function.BiFunction;
public class Addition {
    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> add =
                (a, b)->a + b;
        System.out.println(" The sum is: "+add.apply(3,22));
    }

}
