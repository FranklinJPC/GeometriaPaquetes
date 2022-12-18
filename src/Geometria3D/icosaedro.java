package Geometria3D;

public class icosaedro {
    private double areaTotal, areaCara, arista, volumenIco;

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
}
