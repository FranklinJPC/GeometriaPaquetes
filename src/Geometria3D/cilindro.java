package Geometria3D;

public class cilindro
{
    public double radio;
    public double altura;
    private double volumen;
    private double area;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private double getRadio() {
        return radio;
    }

    private double getAltura() {
        return altura;
    }

    private double getVolumen() {
        return volumen;
    }

    private double getArea() {
        return area;
    }

    public void calcularArea()
    {
        setArea((2 * Math.PI * getRadio() * getAltura()) + (2 * Math.PI * Math.pow(getRadio(), 2)));
    }

    public void calcularVolumen()
    {
        setVolumen((Math.PI * Math.pow(getRadio(), 2)) * getAltura());
    }
    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Volumen: " + getVolumen());
    }
}
