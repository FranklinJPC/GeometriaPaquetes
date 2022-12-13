import Geometria2D.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        circulo das = new circulo();
        das.circulo(15.5);
        das.calcularPerimetro(15.5);
        das.calculoArea(15.5);
        das.Ver();

        System.out.println("==========================");
        System.out.println("\tTRIANGULO\n");
        triangulo tri=new triangulo();
        tri.AreaTriangulo(5.5,10.2);
        tri.PerimetroTriangulo(15.2,13.1,5);
        tri.MostrarTriangulo();
        System.out.println("==========================");
        System.out.println("\tTRAPEZOIDE\n");
        trapezoide trap=new trapezoide();
        trap.AreaTrapezoide(15.20,30.8);
        trap.PerimetroTrapezoide(5,8.4,10,20.5);
        trap.MostrarTrapezoide();
        System.out.println("==========================");
        System.out.println("\tTRAPECIO\n");
        trapecio pecio=new trapecio();
        pecio.AreaTrapecio(20.5,10.5,8);
        pecio.PerimetroTrapecio(20.5,10.5,4,6);
        pecio.MostrarTrapecio();
    }
}