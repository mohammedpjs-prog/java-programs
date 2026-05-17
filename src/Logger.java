public interface Logger {
    default void LogINFO(){
        connect ();
        System.out.println(" INGO log ");
    }
    default  void LogError(){
        connect();
        System.out.println(" Error log ");
    }
    default void connect(){
        System.out.println(" connecting to the server: ");
    }
}
class AppLogger implements Logger{
        public void LogINFO(){
        }
}