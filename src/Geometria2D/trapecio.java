package Geometria2D;

public class trapecio {
    private double bmayor,bmenor,altura,l1,l2,perimetroTrapecio,areaTrapecio;
    public trapecio()
    {
        bmayor = 0;
        bmenor = 0;
        altura=0;
        l1=0;
        l2=0;

    }

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
}
