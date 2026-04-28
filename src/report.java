public class report {
    public static void main(String[] args){
        marks mk = new marks();
        marks mk2 = new marks();
        mk2.setName("rahul");
        mk2.setMarks(55);
        mk.setName("rahul");
        mk.setMarks(95);
        System.out.println(mk.getName());
        System.out.println(mk.getMarks());
        System.out.println(mk.getName());
        System.out.println(mk.getMarks());
    }
}
