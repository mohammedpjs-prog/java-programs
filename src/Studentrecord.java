public class Studentrecord {
    private String name;
    private  int marks;

    public void setName(String name ){
        this.name = name;
    }
    public void setMarks(int marks){
        if (marks>=0&&marks<=100){
            this.marks=marks;
        }else {
            System.out.println(" Invalid marks ");

        }
    }
    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }
    public boolean hasPassed() {
            return marks >= 40;
        }





    }








