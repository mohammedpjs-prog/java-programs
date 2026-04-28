public class STdata {
    public static void main(String[] args){
        Student s = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        s.setName("Rohit");
        s2.setName("tom");
        s3.setName("rahul");
        s2.setMarks(99);
        s3.setMarks(77);
        s4.setMarks(44);
        s5.setMarks(99);
        System.out.println(s.getName());
        System.out.println(s2.getMarks());
        System.out.println(s3.getMarks());
        System.out.println(s4.getMarks());
        System.out.println(s5.getMarks());
        System.out.println(s.getMarks());


    }
}
