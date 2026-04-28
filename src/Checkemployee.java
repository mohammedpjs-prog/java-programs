public class Checkemployee {
    public static void main(String[] args){
        Employee e = new Employee();
        Employee e1 = new Employee("TATA");
        Employee e2 = new Employee("Ratan",1245);
        Employee e3 = new Employee("AAA",32323,10000.0);

        e.display();
        e1.display();
        e2.display();
        e3.display();
    }
}
