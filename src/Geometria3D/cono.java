package Geometria3D;

public class cono
{
    public double radio;
    public double altura;
    public double apertura;
    private double volumen;
    private double area;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
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

    private double getApertura() {
        return apertura;
    }

    private double getVolumen() {
        return volumen;
    }

    private double getArea() {
        return area;
    }

    public void calcularArea()
    {
        setArea((Math.PI * getRadio())*(getRadio() + getApertura()));
    }
    public void calcularVolumen()
    {
        setVolumen((Math.PI * getAltura() * Math.pow(getRadio(), 2)) / 3);
    }
    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Volumen: " + getVolumen());
    }
}
