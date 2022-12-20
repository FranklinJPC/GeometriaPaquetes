package Geometria2D;
import FiguraGeneral.*;

public class trapezoide extends FiguraBase
{
    private double a1,a2,altura,l1,l2,l3,l4,perimetroTrapezoide,areaTrapezoide;


    public trapezoide(double a1, double a2, double l1, double l2, double l3, double l4, double altura)
    {
        this.a1 = a1;
        this.a2 = a2;
        this.altura = altura;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
        calcularPerimetro();
        calcularArea();
    }
    public double getArea() {
        return areaTrapezoide;
    }

    public double getPerimetro() {
        return perimetroTrapezoide;
    }

    @Override
    protected void calcularArea() {
        areaTrapezoide = ((a1 + a2) / 2) * altura;
    }

    @Override
    protected void calcularPerimetro() {
        perimetroTrapezoide = l1 + l2 + l3 + l4;
    }

    @Override
    protected void calcularVolumen() {

    }

    /*
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
     */
}
