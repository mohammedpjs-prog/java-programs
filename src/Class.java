public class Class {
    String name;
    int clno;
    Class(){
        name = " Unknown ";
        clno = 0;
    }
    Class(String n){
        name = n;
        clno = 0;
    }
    Class(String n, int no){
        name = n;
        clno = no;

    }
    void display(){
        System.out.println(name + " " + clno);
    }
}
