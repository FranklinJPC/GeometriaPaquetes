package Geometria2D;

public class circulo
{
    private double area;
    public double radio;
    private double perimetro;

    public circulo()
    {
        area = 0;
        perimetro = 0;
        radio = 0;
    }

    private double getArea() {
        return area;
    }

    private double getPerimetro() {
        return perimetro;
    }

    public void circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private double setArea(double area) {
        this.area = area;
        return area;
    }

    private double setPerimetro(double perimetro) {
        this.perimetro = perimetro;
        return perimetro;
    }

    public void calculoArea(double radio)
    {
        setArea(Math.PI * Math.pow(radio, 2));
    }

    public void calcularPerimetro(double radio)
    {
        setPerimetro(2 * Math.PI * radio);
    }

    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimerto: " + getPerimetro());
    }
}
