public class practice {
    public static void main(String[] args){
        greet("tom");
        greet("rizwan");
        int sum =  add(5,8);
        System.out.println(sum);
        int pro = multiply(5,8);
        System.out.println(pro);

    }
    public static void greet(String name){
        System.out.println(" hello " + name + "!");
    }
    public static int add( int a, int b) {
        return  a + b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
}
