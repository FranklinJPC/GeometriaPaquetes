import Geometria2D.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        circulo das = new circulo();
        das.setRadio(15.5);
        das.circulo(das.getRadio());
        das.calcularPerimetro(das.getRadio());
        das.calculoArea(das.getRadio());
        das.Ver();

        System.out.println("\nCuadrado");
        cuadrado cuad = new cuadrado();
        cuad.setLado(14);
        cuad.calcularPerimetro(cuad.getLado());
        cuad.calculoArea(cuad.getLado());
        cuad.Ver();

        System.out.println("\nEneagono");
        eneagono ene = new eneagono();
        ene.setLado(5.23);
        ene.setApotema(3);
        ene.calcularPerimetro(ene.getLado());
        ene.calculoArea(ene.getApotema());
        ene.Ver();

        System.out.println("\nHeptagono");
        Heptagono hepta = new Heptagono();
        hepta.setLado(5);
        hepta.setApotema(12);
        hepta.calcularPerimetro(hepta.getLado());
        hepta.calculoArea(ene.getApotema());
        hepta.Ver();

        System.out.println("\nHexagono");
        hexagono hexa = new hexagono();
        hexa.setLado(1.25);
        hexa.setApotema(3.56);
        hexa.calcularPerimetro(hexa.getLado());
        hexa.calculoArea(hexa.getApotema());
        hexa.Ver();
    }
}