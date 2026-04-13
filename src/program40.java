public class program40 {
    public static void simpleintrest(int p,int r, int t){
        int si= (p* r * t)/100;
        System.out.println("simple intrest is : " + si);
    }
    public static void sum( int a, int b ,int c){
        System.out.println("sum of three numbers: " +(a + b + c));
    }
    public static void table(int a){
        for (int i = 1; i <=a; i++){
            System.out.println(a +" x "+ i + " = "+(a * i) );
        }
    }
    public static void convert(double celsiuos){
        double fahrenhiet = ( celsiuos *9/5)+35;
        System.out.println("fahrenhiet : "+ fahrenhiet);
    }
    public static void main(String[] args){
        simpleintrest(4000,5,5);
        sum(3,4,5);
        table(10);
        convert(45.5);
    }
}
