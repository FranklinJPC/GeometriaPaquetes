package Geometria2D;

public class octagono {
    private double areaOcta,perimetroOcta,ladoOcta,apotemaOcta;
    public octagono (){

        areaOcta=0;
        perimetroOcta=0;
        ladoOcta=0;
        apotemaOcta=0;


    }


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


}
