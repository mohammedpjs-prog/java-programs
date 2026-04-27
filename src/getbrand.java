public class getbrand {
    public static void main(String[] args){
        brand br = new brand();
        brand br2 = new brand();
        br.setcar("toyota");
        br2.setcar("Audi");
        br.setSpeed(150);
        br2.setSpeed(120);
        System.out.println(br.getCar());
        System.out.println(br.getSpeed());
        System.out.println(br2.getSpeed());
        System.out.println(br2.getCar());

    }
}
