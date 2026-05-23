public class Calculate {
    public static void main(String[] args){
        calculator c = (a,b) -> a + b;

        calculator2 c1 = (a,b)-> a * b;

        System.out.println(c.add(10,20));

        System.out.println(c1.multiply(10,20));
    }
}
