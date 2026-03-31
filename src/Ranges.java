public class Ranges {
        public static void main(String[] args){
            System.out.println("byte range:" + Byte.MIN_VALUE +"to"+ Byte.MAX_VALUE);
            System.out.println("short range"+Short.MIN_VALUE+ "to" +Short.MAX_VALUE );
            int a = 10;
            float b = a;
            System.out.println(b);
            double c = 10.75;
            int num = (int) c;
            System.out.println(num);
            char ch = 'A';
            int e = ch;
            System.out.println(e);
            char f = 'a';
            float g = f;
            System.out.println(g);
            byte w = 10;
            short x = 100;
            int y = 1000;
            long z = 4000000L;
            long result = w + 10 *(x + y +z);
            System.out.println("total=" + result);
            float r = 1.23456789f;
            double d = 1.234567890123456;
            System.out.println(r);
            System.out.println(d);
            double A = 0.1;
            double B = 0.2;
            System.out.println(A + B);
            char q1 = '?';
            char q2 = 63;
            char q3 = '\u003F';

            System.out.println(q1);
            System.out.println(q2);
            System.out.println(q3);
            String mystring = "this is  a string ";
            System.out.println(mystring);
            String mystring2 = mystring + "of string ";
            System.out.println(mystring + mystring2);






        }
}
