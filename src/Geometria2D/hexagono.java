package Geometria2D;

public class hexagono
{
    private double area;
    public double lado;
    public double apotema;
    private double perimetro;

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
}
