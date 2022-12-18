package Geometria2D;

public class circulo
{
    private double area;
    public double radio;
    private double perimetro;

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
}
