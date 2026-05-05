abstract class bank {
   abstract void intrestrate();
}
class Canara extends bank {
    void intrestrate() {
        System.out.println(" Rate is 5%");

    }
}
class HDFC extends bank{
    void intrestrate(){
        System.out.println(" Rate is 6% ");
    }
}
class SBI extends bank{
    void intrestrate(){
        System.out.println(" Rate is 4% ");
    }
}