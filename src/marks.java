public class marks {
    private String name;
    private int marks;

    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        if (marks >0 && marks<=100){
            this.marks=marks;
        }
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
