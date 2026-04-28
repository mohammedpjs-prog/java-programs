public class wheather {
    private double temparature;

    public void setTemparature(double temp){
        if (temp >= -50 && temp <= 150){
            this.temparature = temp;
        }else {
            System.out.println(" INVALID TEMPARATYURE ");
        }
    }
    public double getTemparature(){
        return temparature;
    }
}
