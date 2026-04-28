public class user {
    private String password = "1234";

    public void setPassword(String pass,String npass){
        if (password.equals(pass)){
            password = npass;
            System.out.println(" Password updated ");
        }else {
            System.out.println(" Wrong old password ");
        }
    }
    public String getPassword(){
        return " Access Denied";
    }
}
