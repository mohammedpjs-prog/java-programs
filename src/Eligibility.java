public class Eligibility {
    private String name;
    private int age;

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age=a;
        if (a >=18 ){
            System.out.println(" You are eligible for account cration ");
        }else {
            System.out.println(" You are not eligible for account creation ");
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
