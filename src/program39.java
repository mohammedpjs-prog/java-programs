public class program39 {
    public  void add(int a,int b){
        System.out.println(" addittion is = "+(a + b));
    }
    public  void sub(int a, int b){
        System.out.println(" difference : "+ (a - b));
    }
    public  void divide(int a, int b){
        System.out.println(" quotient is : "+ ( a/b));
    }
    public  void square(int a){
        System.out.println(" square of "+ a + " is : "+(a * a));
    }
    public  void cube(int a){
        System.out.println(" cube of " + a + " is : "+ (a * a * a));
    }
    public  void max(int a, int b){
        if (a > b){
            System.out.println(a + " is grater than "+ b );
        }else {
            System.out.println(a + " is less than "+ b);
        }
    }
    public static void main(String[] args){
        program39 cal = new program39();
                cal.add(5,3);
                cal.sub(8,2);
                cal.square(8);
                cal.cube(9);

        








    }

}
