public class Person {
    String name = " John ";
    int age = 23;
    void Showname(){
        System.out.println(" Name " + " - " + name);
    }
    void Showage(){
        System.out.println(" Age is " + age);
    }
}
class Child extends Person{
    int rollno = 21;
    void Showrollno(){
        System.out.println(" Roll no " + " - " + rollno);
    }
}
