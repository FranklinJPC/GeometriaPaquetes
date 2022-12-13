package Geometria2D;

public class cuadrado
{
    private double area;
    public double lado;
    private double perimetro;

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double setArea(double area) {
        this.area = area;
        return area;
    }

    private double setPerimetro(double perimetro) {
        this.perimetro = perimetro;
        return perimetro;
    }

    private double getArea() {
        return area;
    }

    private double getPerimetro() {
        return perimetro;
    }

    public double getLado() {
        return lado;
    }

    public double calculoArea(double lado)
    {
        return setArea(Math.pow(lado,2));
    }

    public double calcularPerimetro(double lado)
    {
        return setPerimetro(4 * lado);
    }

    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimerto: " + getPerimetro());
    }
}
