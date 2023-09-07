package AA_Baloon;

public class Class_Baloon {
    private double volume;
    public Class_Baloon(){
        volume =0.0;
    }
    public void addAir(double amount){
        volume = volume + amount;
    }
    public double getVolume(){
        return volume;
    }
    public double getSurfaceArea(){
        return 4 * Math.PI * Math.pow(getRadius(),2);


    }
    public double getRadius(){

        return Math.cbrt(volume * (3/4)/Math.PI);
    }
}
