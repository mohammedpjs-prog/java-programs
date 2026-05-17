public class CheckLevel {
    enum Level {

    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }
  }
  public static void main(String[] args){
        Level l = Level.LOW;
      System.out.println(l.value);
  }
}
