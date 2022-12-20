package Geometria3D;

import FiguraGeneral.FiguraBase;

public class piramide extends FiguraBase
{
    private double ladoPiramide,alturaPiramide,volumenPiramide,areaPiramide;

    public piramide(double ladoPiramide, double alturaPiramide)
    {
        this.alturaPiramide = alturaPiramide;
        this.ladoPiramide = ladoPiramide;
        calcularArea();
        calcularVolumen();
    }

    public double getVolumen() {
        return volumenPiramide;
    }

    public double getArea() {
        return areaPiramide;
    }

    @Override
    protected void calcularArea() {
        areaPiramide = ladoPiramide*(ladoPiramide+(Math.sqrt(4*Math.pow(alturaPiramide,2)+(Math.pow(ladoPiramide,2)))));
    }

    @Override
    protected void calcularPerimetro() {

    }

    @Override
    protected void calcularVolumen() {
        volumenPiramide = (Math.pow(ladoPiramide,2)*alturaPiramide)/3;
    }

    /*
    public double getVolumenPiramide() {
        return volumenPiramide;
    }

    public double getAreaPiramide() {
        return areaPiramide;
    }

    public void setLadoPiramide(double ladoPiramide) {
        this.ladoPiramide = ladoPiramide;
    }

    public void setAlturaPiramide(double alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }

    public double setVolumenPiramide(double volumenPiramide) {
        this.volumenPiramide = volumenPiramide;
        return volumenPiramide;
    }

    public double setAreaPiramide(double areaPiramide) {
        this.areaPiramide = areaPiramide;
        return areaPiramide;
    }
    public double AreaPiramide(double ladoPiramide, double alturaPiramide){
        return setAreaPiramide(ladoPiramide*(ladoPiramide+(Math.sqrt(4*Math.pow(alturaPiramide,2)+(Math.pow(ladoPiramide,2))))));

    }
    public double VolumenPiramide(double ladoPiramide, double alturaPiramide){
        return setVolumenPiramide((Math.pow(ladoPiramide,2)*alturaPiramide)/3);
    }
    public void MostrarPrisma()
    {
        System.out.println("Area: "+getAreaPiramide() );
        System.out.println("Volumen: "+getVolumenPiramide() );

    }
     */
}
