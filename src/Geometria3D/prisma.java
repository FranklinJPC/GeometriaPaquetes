package Geometria3D;

public class prisma {
private double areaLateral,areaBase,altura,AreaPrisma,VolumenPrisma;

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

}
