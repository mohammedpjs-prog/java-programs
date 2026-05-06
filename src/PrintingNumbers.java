abstract class PrintingNumbers {
    void print(){
        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }
    }
}
class Numbers extends PrintingNumbers{
    void print(){
        super.print();

    }
    public static void main(String[] args){
        PrintingNumbers p = new Numbers();
        p.print();
    }
}
