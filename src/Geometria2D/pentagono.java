package Geometria2D;
import FiguraGeneral.*;

public class pentagono extends FiguraBase
{
    private double lado,perimetroPetagono,areaPentagono,apotemaPentagono;
    public  pentagono(double lado, double apotemaPentagono){
        this.lado = lado;
        this.apotemaPentagono = apotemaPentagono;
        calcularPerimetro();
        calcularArea();
    }
    public double getArea() {
        return areaPentagono;
    }

    public double getPerimetro() {
        return perimetroPetagono;
    }

    @Override
    protected void calcularArea() {
        areaPentagono = (perimetroPetagono * apotemaPentagono) / 2;
    }

    @Override
    protected void calcularPerimetro() {
        perimetroPetagono = lado * 5;
    }

    @Override
    protected void calcularVolumen() {

    }


    /*
    public double getPerimetroPetagono() {
        return perimetroPetagono;
    }

    public double getAreaPentagono() {
        return areaPentagono;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    private void setApotemaPentagono(double apotemaPentagono) {
        this.apotemaPentagono = apotemaPentagono;
    }

    private double setPerimetroPetagono(double perimetroPetagono) {
        this.perimetroPetagono = perimetroPetagono;
        return perimetroPetagono;
    }

    private double setAreaPentagono(double areaPentagono) {
        this.areaPentagono = areaPentagono;
        return areaPentagono;
    }

    public  double AreaPentagono(double perimetroPetagono, double apotemaPentagono){
    return setAreaPentagono((perimetroPetagono*apotemaPentagono)/2);
    }
    public  double PerimetroPentagono(double lado){
        return setPerimetroPetagono(lado*5);
    }



    public void MostrarPentagono()
    {
        System.out.println("Area: "+getAreaPentagono()  );
        System.out.println("Perimerto: "+getPerimetroPetagono() );
    }
     */
}
