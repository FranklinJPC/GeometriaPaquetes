package Geometria3D;

public class tetraedro {
    private    double areatetraedro,volumentetraedro,alturatetraedro,ladotetraedro;


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


}
