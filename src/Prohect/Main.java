package Prohect;
public class Main {
    void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
       Main m = new Main();
       Runnable r =m::display;
       r.run();
    }

}
