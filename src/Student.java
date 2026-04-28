public class Student {
    private String name;
    private int marks;

    public void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMarks(int marks){
        if (marks>0&&marks<=100){
            this.marks = marks;
        }else {
            System.out.println(" Invalid marks ");
        }
    }
    public int getMarks(){
        return marks;
    }
}
