public class cali {
    static int mod(int x,int y){
        return x % y;
    }
    static int add(int a,int b){
        return a + b;
    }
    public static void main(String[] args){
        cali c= new cali();
        int res = c.mod(17,16);
        int R = c.mod(137,16);
        System.out.println(R);
        int re = c.mod(14,16);
        System.out.println(re);
        int r=c.mod(13,16);
        System.out.println(r);
        System.out.println(res);
        int sum = c.add(4,90);
        System.out.println(sum);
    }
}
