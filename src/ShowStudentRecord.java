public class ShowStudentRecord {
    public static void main(String[] args){
        Studentrecord sr = new Studentrecord();
        sr.setName("Raj");
        System.out.println(sr.getName());
        sr.setMarks(39);
        System.out.println(sr.getMarks());

        if (sr.hasPassed()) {
            System.out.println("Student passed");
        } else {
            System.out.println("Student failed");
        }

    }

}
