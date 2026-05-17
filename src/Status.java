public enum Status {
    SUCCESS,
    FAILED;
    public void message(){
        if (this == SUCCESS){
            System.out.println(" Operation successfull ");
        }else {
            System.out.println(" Operation failed ");
        }
    }
}

