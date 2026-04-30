public class Bus {
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    private String color;

    void Engine(){
        System.out.println(" Driver starts engine...");

    }

    public static void main(String[] args){
        Bus b = new Bus();
        b.Engine();
       b.setColor("blue");
        System.out.println(b.getColor());


    }
}
