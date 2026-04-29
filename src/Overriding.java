public class Overriding {
    public static void main(String[] args){
        D d = new D();
        Cat c = new Cat();
        c.sound();
        c.eat();
        d.sound();
        d.eat();
    }
}
