public class AutoMobileStatus {
    public static void main(String[] args){
        AutoMobile m = new Motorcycle();
        m.fueltype();
        m.start();
        AutoMobile e = new ElectricCar();
        e.fueltype();
        e.start();
    }


}
