package Geometria2D;
import FiguraGeneral.*;


public class circulo extends FiguraBase
{
    private double area;
    public double radio;
    private double perimetro;

    public circulo(double radio)
    {
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    protected void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    @Override
    protected void calcularVolumen() {
    }


    /*
    private double getPerimetro() {
        return perimetro;
    }

    public void circulo(double radio)
    {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private double setArea(double area) {
        this.area = area;
        return area;
    }



    public double calculoArea(double radio)
    {
        return setArea(Math.PI * Math.pow(radio, 2));
    }

    public double calcularPerimetro(double radio)
    {
        return setPerimetro(2 * Math.PI * radio);
    }
    private double setPerimetro(double perimetro) {
        this.perimetro = perimetro;
        return perimetro;
    }

    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimerto: " + getPerimetro());
    }

     */
}
