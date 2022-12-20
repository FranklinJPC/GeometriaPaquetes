package Geometria3D;
import FiguraGeneral.*;

public class tetraedro extends FiguraBase
{
    private double areatetraedro,volumentetraedro,alturatetraedro,ladotetraedro;

    public tetraedro(double alturatetraedro, double ladotetraedro)
    {
        this.alturatetraedro = alturatetraedro;
        this.ladotetraedro = ladotetraedro;
        calcularArea();
        calcularVolumen();
    }

    public double getArea() {
        return areatetraedro;
    }


    public double getVolumen() {
        return volumentetraedro;
    }

    @Override
    protected void calcularArea() {
        areatetraedro = Math.pow(ladotetraedro,2)*(Math.sqrt(3));
    }

    @Override
    protected void calcularPerimetro() {

    }

    @Override
    protected void calcularVolumen() {
        volumentetraedro = (Math.pow(ladotetraedro,3)*(Math.sqrt(2)/12));
    }
    /*
    public double getAreatetraedro() {
        return areatetraedro;
    }

    public double getVolumentetraedro() {
        return volumentetraedro;
    }

    public double getAlturatetraedro() {
        return alturatetraedro;
    }

    private double setAreatetraedro(double areatetraedro) {
        this.areatetraedro = areatetraedro;
        return areatetraedro;
    }

    private double setVolumentetraedro(double volumentetraedro) {
        this.volumentetraedro = volumentetraedro;
        return volumentetraedro;
    }

    private double setAlturatetraedro(double alturatetraedro) {
        this.alturatetraedro = alturatetraedro;
        return alturatetraedro;
    }

    public void setLadotetraedro(double ladotetraedro) {
        this.ladotetraedro = ladotetraedro;
    }

    public double AreaTetraedro(double ladotetraedro){
    return  setAreatetraedro(Math.pow(ladotetraedro,2)*(Math.sqrt(3)));

    }
    public double volumenTetraedro(double ladotetraedro){
        return setVolumentetraedro((Math.pow(ladotetraedro,3)*(Math.sqrt(2)/12)));
    }
    public double AlturaTetraedro(double ladotetraedro){
    return  setAlturatetraedro(ladotetraedro*(Math.sqrt(6)/3));

    }

    public void MostrarTetraedro()
    {
        System.out.println("Area: "+getAreatetraedro() );
        System.out.println("Volumen: "+getVolumentetraedro() );
        System.out.println("Altura: "+getAlturatetraedro() );
    }

     */


}
