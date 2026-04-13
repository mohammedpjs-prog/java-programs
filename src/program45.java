public class program45 {
    public static boolean hasshared(int a, int b){
        if ((a<10)||(a>99)||(b<10)||(b>99)){
            return false;
        }
        int first1 = a /10;
        int first2 = a%10;
        int last1 = b/10;
        int last2 = b%10;
        return first1==first2||first1==last1||first2==last2||last1==last2;
    }
    public static void main(String[] args) {
        System.out.println(hasshared(88, 33));
        System.out.println(hasshared(76, 22));
        System.out.println(hasshared(8,2));
        System.out.println(hasshared(32,56));
    }
}
