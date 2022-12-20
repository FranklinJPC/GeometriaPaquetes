package Geometria3D;
import FiguraGeneral.*;

public class cubo extends FiguraBase
{
    public double lado;
    private double volumen;
    private double area;

    public cubo(double lado)
    {
        this.lado = lado;
        calcularArea();
        calcularVolumen();
    }

    public double getVolumen() {
        return volumen;
    }
    public double getArea() {
        return area;
    }

    @Override
    protected void calcularArea() {
        area = 6 * Math.pow(lado, 2);
    }

    @Override
    protected void calcularPerimetro() {

    }

    @Override
    protected void calcularVolumen() {
        volumen = Math.pow(lado, 3);
    }

    /*
    private double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double getVolumen() {
        return volumen;
    }

    private void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    private double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    public void calcularArea()
    {
        setArea(6 * Math.pow(getLado(), 2));
    }
    public void calcularVolumen()
    {
        setVolumen(Math.pow(getLado(), 3));
    }
    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Volumen: " + getVolumen());
    }

     */
}
