package Geometria2D;

public class triangulo {
    private double base
            ,altura,
            area,
            perimetro,
            ladoM,
            ladom;


    public triangulo()
    {
        area = 0;
        perimetro = 0;
        base=0;
        altura=0;
        ladom=0;
        ladoM=0;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLadoM(double ladoM) {
        this.ladoM = ladoM;
    }

    public void setLadom(double ladom) {
        this.ladom = ladom;
    }

    private double setArea(double area) {
        this.area = area;
        return area;
    }

    private double setPerimetro(double perimetro) {
        this.perimetro = perimetro;
        return perimetro;
    }


    public double AreaTriangulo(double base,double altura){
        return  setArea((base*altura)/2);
    }
    public  double PerimetroTriangulo(double ladoM,double ladom, double base){
        return  setPerimetro(ladoM+ladom+base);
    }
    public void MostrarTriangulo()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimerto: " + getPerimetro());
    }
}
