package uz.dawo;

public class RightTriangle {

    private int firstKatet;
    private int secondKatet;
    private int gipatinuza;

    public RightTriangle() {
    }

    public RightTriangle(int firstKatet, int secondKatet, int gipatinuza) {
        this.firstKatet = firstKatet;
        this.secondKatet = secondKatet;
        this.gipatinuza = gipatinuza;
    }





    //    area of triangle
    public double getArea() {
        return firstKatet * secondKatet * 0.5;
    }

    //    perimatr of triangle
    public int getPerimatr() {
        return firstKatet + secondKatet + gipatinuza;
    }

    //    types of these (overloadings)
    public double getArea(double a, double b, double gipatenuza) {
        return a * b * 0.5;
    }

    public float getArea(float a, float b, float gipatenuza) {
        return (float) (a * b * 0.5);
    }

    public int getPerimatr(int a, int b, int c) {
        return a + b + c;
    }

    public long getPerimatr(long a, long b, long c) {
        return a + b + c;
    }








    public int getFirstKatet() {
        return firstKatet;
    }

    public void setFirstKatet(int firstKatet) {
        this.firstKatet = firstKatet;
    }

    public int getSecondKatet() {
        return secondKatet;
    }

    public void setSecondKatet(int secondKatet) {
        this.secondKatet = secondKatet;
    }

    public int getGipatinuza() {
        return gipatinuza;
    }

    public void setGipatinuza(int gipatinuza) {
        this.gipatinuza = gipatinuza;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "firstKatet=" + firstKatet +
                ", secondKatet=" + secondKatet +
                ", gipatinuza=" + gipatinuza +
                '}';
    }
}
