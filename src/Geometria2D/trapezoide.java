package Geometria2D;

public class trapezoide {
    private double a1,a2,altura,l1,l2,l3,l4,perimetroTrapezoide,areaTrapezoide;


    public trapezoide()
    {
        a1 = 0;
        a2 = 0;
        altura=0;
        l1=0;
        l2=0;
        l3=0;
        l4=0;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetroTrapezoide() {
        return perimetroTrapezoide;
    }

    public double getAreaTrapezoide() {
        return areaTrapezoide;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double setPerimetroTrapezoide(double perimetroTrapezoide) {
        this.perimetroTrapezoide = perimetroTrapezoide;
        return perimetroTrapezoide;
    }

    public double setAreaTrapezoide(double areaTrapezoide) {
        this.areaTrapezoide = areaTrapezoide;
        return areaTrapezoide;
    }

    public double AreaTrapezoide(double a1,double a2){
    return setAreaTrapezoide(a1+a2);
    }
    public double PerimetroTrapezoide(double l1,double l2, double l3, double l4){
    return setPerimetroTrapezoide(l1+l2+l3+l4);
    }

    public void MostrarTrapezoide()
    {
        System.out.println("Area: " + getAreaTrapezoide());
        System.out.println("Perimerto: " + getPerimetroTrapezoide());
    }
}
