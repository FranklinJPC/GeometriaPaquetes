package Geometria2D;
import FiguraGeneral.*;

public class octagono extends FiguraBase
{
    private double areaOcta,perimetroOcta,ladoOcta,apotemaOcta;
    public octagono (double ladoOcta, double apotemaOcta)
    {
        this.ladoOcta = ladoOcta;
        this.apotemaOcta = apotemaOcta;
        calcularArea();
        calcularPerimetro();
    }
    public double getArea() {
        return areaOcta;
    }

    public double getPerimetro() {
        return perimetroOcta;
    }

    @Override
    protected void calcularArea() {
        areaOcta = (perimetroOcta * apotemaOcta) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetroOcta = ladoOcta * 8;
    }

    @Override
    protected void calcularVolumen() {

    }



    /*
    public double getAreaOcta() {
        return areaOcta;
    }

    public double getPerimetroOcta() {
        return perimetroOcta;
    }

    private double setAreaOcta(double areaOcta) {
        this.areaOcta = areaOcta;
        return areaOcta;
    }

    private double setPerimetroOcta(double perimetroOcta) {
        this.perimetroOcta = perimetroOcta;
        return perimetroOcta;
    }

    public void setLadoOcta(double ladoOcta) {
        this.ladoOcta = ladoOcta;
    }

    public void setApotemaOcta(double apotemaOcta) {
        this.apotemaOcta = apotemaOcta;
    }
    public double AreaOctagono(double ladoOcta,double apotemaOcta){
        return setAreaOcta(4*ladoOcta*apotemaOcta);

    }

    public double PerimetroOctagono(double ladoOcta){
    return  setPerimetroOcta(8*ladoOcta);

    }

    public void MostrarOctagono()
    {
        System.out.println("Area: "+getAreaOcta()  );
        System.out.println("Perimerto: "+getPerimetroOcta() );
    }
     */

}
