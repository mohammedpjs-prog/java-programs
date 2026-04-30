class CPU {
    void process() {
        System.out.println("CPU is processing data...");
    }
}class RAM {
    void load() {
        System.out.println("RAM is loading data...");
    }
}class Storage {
    void read() {
        System.out.println("Storage is reading/writing data...");
    }
}public class Computer {
    private CPU cpu ;
    private RAM ram;
    private Storage storage;

    public Computer(){
        this.cpu = new CPU();
        this.ram= new RAM();
        this.storage = new Storage();

    }
    public void start(){
        System.out.println("Computer is starting :)");
        cpu.process();
        ram.load();
        storage.read();
    }
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }
}
