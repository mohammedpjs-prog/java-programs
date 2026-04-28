public class login {
    public static void main(String[] args){
        user u = new user();
        System.out.println(u.getPassword());
        u.setPassword("1233","5678");
        System.out.println(u.getPassword());
    }
}
