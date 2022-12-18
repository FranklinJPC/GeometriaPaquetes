package Geometria3D;

public class prisma_triangular
{
    public double altura;
    public double base;
    public double lado;
    private double volumen;
    private double area;

    private double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
        setArea(((getBase() * getLado() * getAltura()) / 2));
    }
    public void calcularVolumen()
    {
        setVolumen(((getBase() * getAltura()) / 2) * getAltura());
    }
    public void Ver()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Volumen: " + getVolumen());
    }
}
