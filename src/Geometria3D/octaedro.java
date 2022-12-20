package Geometria3D;
import FiguraGeneral.*;

public class octaedro extends FiguraBase
{
    private double areaoctaedro,volumenoctaedro,alturaoctaedro,ladooctaedro;

    public octaedro(double alturaoctaedro, double ladooctaedro)
    {
        this.alturaoctaedro = alturaoctaedro;
        this.ladooctaedro = ladooctaedro;
        calcularArea();
        calcularVolumen();
    }

    public double getArea() {
        return areaoctaedro;
    }

    public double getVolumen() {
        return volumenoctaedro;
    }

    @Override
    protected void calcularArea() {
        areaoctaedro = Math.pow(ladooctaedro,2)*(Math.sqrt(3)*2);
    }

    @Override
    protected void calcularPerimetro() {

    }

    @Override
    protected void calcularVolumen() {
        volumenoctaedro = Math.pow(ladooctaedro,3)*(Math.sqrt(2)/3);
    }

    /*

    private double getAreaoctaedro() {
        return areaoctaedro;
    }

    private double getVolumenoctaedro() {
        return volumenoctaedro;
    }

    private double getAlturaoctaedro() {
        return alturaoctaedro;
    }

    private double setAreaoctaedro(double areaoctaedro) {
        this.areaoctaedro = areaoctaedro;
        return areaoctaedro;
    }

    private double setVolumenoctaedro(double volumenoctaedro) {
        this.volumenoctaedro = volumenoctaedro;
        return volumenoctaedro;
    }

    private double setAlturaoctaedro(double alturaoctaedro) {
        this.alturaoctaedro = alturaoctaedro;
        return alturaoctaedro ;
    }

    private void setLadooctaedro(double ladooctaedro) {
        this.ladooctaedro = ladooctaedro;
    }
    public double AreaOctaedro(double ladooctaedro){
        return  setAreaoctaedro(Math.pow(ladooctaedro,2)*(Math.sqrt(3)*2));

    }
    public double VolumenOctaedro(double ladooctaedro){
        return  setVolumenoctaedro(Math.pow(ladooctaedro,3)*(Math.sqrt(2)/3));

    }
    public double AlturaOctaedro(double ladooctaedro){
    return setAlturaoctaedro(ladooctaedro*Math.sqrt(2));
    }
    public void MostrarOctaedro()
    {
        System.out.println("Area: "+ getAreaoctaedro());
        System.out.println("Volumen: "+getVolumenoctaedro() );
        System.out.println("Altura: "+getAlturaoctaedro() );
    }
     */

}
