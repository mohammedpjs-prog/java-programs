package Java8Overview;

public interface Vehical {
    default void start(){
        System.out.println(" Car is starting....");
    }
}
