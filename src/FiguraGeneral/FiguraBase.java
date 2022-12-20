package FiguraGeneral;

public abstract class FiguraBase
{
    double perimetro;
    double area;
    double volumen;

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }

    protected abstract void calcularArea();
    protected abstract void calcularPerimetro();
    protected abstract void calcularVolumen();
}
