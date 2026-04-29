public class Employe {
    void work(){
        System.out.println(" Employee is working  ");
    }
    void test(){
        System.out.println(" Testing a code ");
    }
}
class Developer extends Employe{
    void code(){
        System.out.println(" Writing a code  ");
    }
}
class Tester extends Employe{
    void Test(){
        System.out.println(" Testing on the code ");
    }
}
