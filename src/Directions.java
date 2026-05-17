public class Directions {
    enum direction{
        NORTH,
        SOUTH,
        WEST,
        EAST
    }
    public static void main(String[] args){
        direction way = direction.NORTH;
        System.out.println(way);
    }
}
