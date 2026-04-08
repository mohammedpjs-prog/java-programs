public class program10 {
    public static boolean equalsumcheck(int a , int b , int c){
        if ( c == a + b ){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(equalsumcheck(1,2,3));
        System.out.println(equalsumcheck(5,4,3));
    }
}
