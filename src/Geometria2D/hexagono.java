package Geometria2D;
import FiguraGeneral.*;

public class hexagono extends FiguraBase
{
    private double area;
    public double lado;
    public double apotema;
    private double perimetro;

    public hexagono(double lado, double apotema)
    {
        this.lado = lado;
        this.apotema = apotema;
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
        area = (perimetro * apotema) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado * 6;
    }

    @Override
    protected void calcularVolumen() {

    }

    /*

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    private double getPerimetro() {
        return perimetro;
    }

    private double getArea() {
        return area;
    }

    public double getApotema() {
        return apotema;
    }

    private double setArea(double area) {
        this.area = area;
        return area;
    }

    private double setPerimetro(double perimetro) {
        this.perimetro = perimetro;
        return perimetro;
    }

    public double calcularPerimetro(double lado)
    {
        return setPerimetro(6 * lado);
    }

    public double calculoArea(double apotema)
    {
        return setArea((getPerimetro() * apotema) / 2);
    }

    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimerto: " + getPerimetro());
    }
     */
}
