public class TestBuilder extends Thread{
    static  StringBuilder sb = new StringBuilder();
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append("A");
        }
    }

    public static void main(String[]args ) throws Exception{
        TestBuilder t1 = new TestBuilder();
        TestBuilder t2 = new TestBuilder();

            t1.start();
            t2.start();

            t1.join();
            t2.join();
        System.out.println(" length : " + sb.length());
    }
}

