package AA_Baloon;

public class Main_Baloon {
    public static void main(String[] args) {
        Class_Baloon classBaloon = new Class_Baloon();

        classBaloon.addAir(200);
        System.out.println("Volume = " + classBaloon.getVolume());
        System.out.println("surface area " + classBaloon.getSurfaceArea());
        System.out.println("radius " + classBaloon.getRadius());

    }
}
