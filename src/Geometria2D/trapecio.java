package Geometria2D;
import FiguraGeneral.*;

public class trapecio extends FiguraBase
{
    private double bmayor,bmenor,altura,l1,l2,perimetroTrapecio,areaTrapecio;
    public trapecio(double altura, double l1, double l2, double bmayor, double bmenor)
    {
        this.altura = altura;
        this.l1 = l1;
        this.l2 = l2;
        this.bmayor = bmayor;
        this.bmenor = bmenor;
        calcularPerimetro();
        calcularArea();
    }
    public double getArea() {
        return areaTrapecio;
    }

    public double getPerimetro() {
        return perimetroTrapecio;
    }

    @Override
    protected void calcularArea() {
        areaTrapecio = (bmayor+bmenor*altura) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetroTrapecio = l1 + l2 + bmayor + bmenor;
    }

    @Override
    protected void calcularVolumen() {

    }

    /*
    public void setBmayor(double bmayor) {
        this.bmayor = bmayor;
    }

    public void setBmenor(double bmenor) {
        this.bmenor = bmenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double setPerimetroTrapecio(double perimetroTrapecio) {
        this.perimetroTrapecio = perimetroTrapecio;
        return perimetroTrapecio;
    }

    public double setAreaTrapecio(double areaTrapecio) {
        this.areaTrapecio = areaTrapecio;
        return areaTrapecio;
    }

    public double getPerimetroTrapecio() {
        return perimetroTrapecio;
    }

    public double getAreaTrapecio() {
        return areaTrapecio;
    }
    public  double AreaTrapecio(double bmayor, double bmenor,double altura){
        return setAreaTrapecio((bmayor+bmenor*altura)/2);
    }

    public double PerimetroTrapecio(double bmayor, double bmenor,double l1, double l2 ){
    return setPerimetroTrapecio(l1+l2+bmayor+bmenor);
    }

    public void MostrarTrapecio()
    {
        System.out.println("Area: " + getAreaTrapecio());
        System.out.println("Perimerto: " + getPerimetroTrapecio());
    }
     */
}
