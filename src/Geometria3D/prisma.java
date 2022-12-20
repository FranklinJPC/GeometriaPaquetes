package Geometria3D;
import FiguraGeneral.*;

public class prisma extends FiguraBase
{
    private double areaLateral,areaBase,altura,AreaPrisma,VolumenPrisma;

    public prisma(double altura, double areaBase, double areaLateral)
    {
        this.altura = altura;
        this.areaLateral = areaLateral;
        this.areaBase = areaBase;
        calcularArea();
        calcularVolumen();
    }

    public double getArea() {
        return AreaPrisma;
    }

    public double getVolumen() {
        return VolumenPrisma;
    }

    @Override
    protected void calcularArea() {
        AreaPrisma = areaLateral+2*(areaBase);
    }

    @Override
    protected void calcularPerimetro() {

    }

    @Override
    protected void calcularVolumen() {
        VolumenPrisma = areaBase*altura;
    }

    /*

    public double getAreaPrisma() {
        return AreaPrisma;
    }

    public double getVolumenPrisma() {
        return VolumenPrisma;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double setAreaPrisma(double areaPrisma) {
        AreaPrisma = areaPrisma;
        return AreaPrisma;
    }

    public double setVolumenPrisma(double volumenPrisma) {
        VolumenPrisma = volumenPrisma;
        return VolumenPrisma;
    }
    public double AreaPrisma(double areaLateral,double areaBase){
        return setAreaPrisma(areaLateral+2*(areaBase));

    }
    public double VolumenPrisma(double areaBase, double altura){
    return setVolumenPrisma(areaBase*altura);

    }
    public void MostrarPrisma()
    {
        System.out.println("Area: "+getAreaPrisma() );
        System.out.println("Volumen: "+getVolumenPrisma() );

    }
 */

}
