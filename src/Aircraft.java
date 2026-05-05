public class Aircraft {
    void fly(){
        System.out.println(" Meant to fly...");

    }
}
class Airoplane extends Aircraft{
    void fly(){
        System.out.println(" Flies just like an aircraft...");
    }
    void Carry(){
        System.out.println(" Carries passengers ");
    }
}
class FigtherJet extends Airoplane{
    void fly(){
        System.out.println(" Flies just like an aircraft... ");
    }
    void Carry(){
        System.out.println(" Carries one person...");
    }
    void type(){
        System.out.println(" Used in Air force...");
    }
}

class AirBus extends Airoplane{
    void fly(){
        System.out.println("Flies just like an aircraft... ");
    }
    void carry(){
        System.out.println(" ");
    }
}
