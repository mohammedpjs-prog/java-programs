public class Employee {
    String name;
    int id;
    double salary;

    Employee(){
        this(" Unknown",0, 0.0);
    }
    Employee(String name){
        this(name,0,0.0);
    }
    Employee(String name,int id){
        this(name,1234,0.0);
    }
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println(name+ " " + id+" "+ salary);
    }
}
