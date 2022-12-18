package Geometria2D;

public class pentagono {
    private double lado,perimetroPetagono,areaPentagono,apotemaPentagono;
    public  pentagono(){

        lado=0;
        perimetroPetagono=0;
        areaPentagono=0;
        apotemaPentagono=0;

    }

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
}
