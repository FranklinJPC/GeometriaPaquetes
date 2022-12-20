package Geometria3D;
import FiguraGeneral.*;

public class cilindro extends FiguraBase
{
    public double radio;
    public double altura;
    private double volumen;
    private double area;

    public cilindro(double altura, double radio)
    {
        this.altura = altura;
        this.radio = radio;
        calcularArea();
        calcularVolumen();
    }

    public double getVolumen() {
        return volumen;
    }

    public double getArea() {
        return area;
    }

    @Override
    protected void calcularArea() {
        area = (2 * Math.PI * radio * altura) + (2 * Math.PI * Math.pow(radio, 2));
    }

    @Override
    protected void calcularPerimetro() {
    }

    @Override
    protected void calcularVolumen() {
        volumen = Math.PI * Math.pow(radio, 2) * altura;
    }

    /*
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
     */
}
