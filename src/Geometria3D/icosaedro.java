package Geometria3D;
import FiguraGeneral.*;

public class icosaedro extends FiguraBase
{
    private double areaTotal, areaCara, arista, volumenIco;

    public icosaedro(double arista)
    {
        this.arista = arista;
        calcularVolumen();
        calcularArea();
    }


    public double getArea() {
        return areaTotal;
    }

    public double getVolumen() {
        return volumenIco;
    }

    @Override
    protected void calcularArea() {
        areaTotal = ((Math.sqrt(3) / 4) * Math.pow(arista, 2)) * 20;
    }

    @Override
    protected void calcularPerimetro() {

    }

    @Override
    protected void calcularVolumen() {
        volumenIco = ((5* (3 + Math.sqrt(5)/12) * (Math.pow(arista, 3))));
    }

    /*
    private double getAreaTotal() {
        return areaTotal;
    }

    private double getAreaCara() {
        return areaCara;
    }

    private double getVolumenIco() {
        return volumenIco;
    }

    public double setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
        return areaTotal;
    }

    public double setAreaCara(double areaCara) {
        this.areaCara = areaCara;
        return areaCara;
    }


    public double setVolumenIco(double volumenIco) {
        this.volumenIco = volumenIco;
        return volumenIco;
    }

    public double AreaIco(double areaCara) {
        return setAreaTotal(20 * areaCara);

    }

    public double AreaCaraIco(double arista) {
        return setAreaCara((Math.sqrt(3) / 4) * Math.pow(arista, 2));

    }

    public double VolumenIco(double arista) {
        return setVolumenIco(((5* (3 + Math.sqrt(5)/12) * (Math.pow(arista, 3)))));
    }
    public void MostrarIcosaedro()
    {
        System.out.println("Area Total: "+getAreaTotal() );
        System.out.println("Area Cara: "+getAreaCara() );
        System.out.println("Volumen: "+getVolumenIco() );
    }
     */
}
