public class Constructor {
    String name;
    int age;
    String course;

    Constructor(){
        this("unknown", 0, "not assigned");
        System.out.println(" Default constructor called ");
    }
    Constructor(String name ){
        this(name, 0, " Not assigned ");
        System.out.println(" 1- ags constructor called ");
    }
    Constructor(String name,int a){
        this(name, a, " Not assigned ");
        System.out.println(" 2-ags constructor called");

    }
    Constructor(String name,int a, String course){
        this.name=name;
        this.age=a;
        this.course=course;
      }
      void display(){
          System.out.println(name +" "+age+" "+course);
      }

}
