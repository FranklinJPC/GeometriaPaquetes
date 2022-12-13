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

    public void setRadio(double radio) {
        this.radio = radio;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private double setPerimetro(double perimetro) {
        this.perimetro = perimetro;
        return perimetro;
    }

    public double calculoArea(double radio)
    {
        return setPerimetro(Math.PI * Math.pow(radio, 2));
    }

    public double calcularPerimetro(double radio)
    {
        return 2 * Math.PI * radio;
    }

    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimerto: " + getPerimetro());
    }
}
