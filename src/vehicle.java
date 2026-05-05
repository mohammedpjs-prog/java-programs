abstract class vehicle {
    abstract void start();
    void fuel(){
        System.out.println(" Vehicles needs fuel. ");
    }
}
class bike extends vehicle{
    void start(){
        System.out.println(" Starts with kick. ");
    }
}
class car extends vehicle{
    void start(){
        System.out.println(" Start with a key. ");
    }
}