package Geometria3D;
import FiguraGeneral.*;

public class cono extends FiguraBase
{
    public double radio;
    public double altura;
    public double apertura;
    private double volumen;
    private double area;

    public double getArea() {
        return area;
    }

    public cono(double radio, double altura, double apertura)
    {
        this.altura = altura;
        this.radio = radio;
        this.apertura = apertura;
        calcularArea();
        calcularVolumen();
    }
    public double getVolumen() {
        return volumen;
    }

    @Override
    protected void calcularArea() {
        area = (Math.PI * radio)*(radio) + apertura;
    }

    @Override
    protected void calcularPerimetro() {

    }

    @Override
    protected void calcularVolumen() {
        volumen = (Math.PI * altura * Math.pow(radio, 2)) / 3;
    }

    /*
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
     */
}
