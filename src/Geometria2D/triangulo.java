package Geometria2D;
import FiguraGeneral.*;

public class triangulo extends FiguraBase
{
    private double base
            ,altura,
            area,
            perimetro,
            ladoM,
            ladom;


    public triangulo(double ladom, double ladoM, double base, double altura)
    {
        this.ladom = ladom;
        this.ladoM = ladoM;
        this.altura = altura;
        this.base = base;
        calcularArea();
        calcularPerimetro();
    }
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    protected void calcularArea() {
        area = (base * altura) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = ladom + ladoM + base;
    }

    @Override
    protected void calcularVolumen() {

    }

    /*
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLadoM(double ladoM) {
        this.ladoM = ladoM;
    }

    public void setLadom(double ladom) {
        this.ladom = ladom;
    }

    private double setArea(double area) {
        this.area = area;
        return area;
    }

    private double setPerimetro(double perimetro) {
        this.perimetro = perimetro;
        return perimetro;
    }


    public double AreaTriangulo(double base,double altura){
        return  setArea((base*altura)/2);
    }
    public  double PerimetroTriangulo(double ladoM,double ladom, double base){
        return  setPerimetro(ladoM+ladom+base);
    }

    public void MostrarTriangulo()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimerto: " + getPerimetro());
    }
     */
}
