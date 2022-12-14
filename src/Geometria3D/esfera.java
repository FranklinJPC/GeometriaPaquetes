package Geometria3D;

public class esfera
{
    public double radio;
    private double volumen;
    private double area;

    private double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
        setArea(4 * Math.PI * Math.pow(getRadio(), 2));
    }
    public void calcularVolumen()
    {
        setVolumen((4 / 3) * Math.PI * Math.pow(getRadio(), 3));
    }
    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Volumen: " + getVolumen());
    }
}
