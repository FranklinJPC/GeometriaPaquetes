import Geometria2D.*;
import Geometria3D.*;

public class main
{
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

        System.out.println("----------------------------------------");
        System.out.println("Cilindro");
        cilindro cilin = new cilindro();
        cilin.setAltura(15);
        cilin.setRadio(12);
        cilin.calcularArea();
        cilin.calcularVolumen();
        cilin.Ver();

        System.out.println("\nCono");
        cono con = new cono();
        con.setApertura(25);
        con.setAltura(15);
        con.setRadio(23);
        con.calcularArea();
        con.calcularVolumen();
        con.Ver();

        System.out.println("\nCubo");
        cubo cub = new cubo();
        cub.setLado(5);
        cub.calcularArea();
        cub.calcularVolumen();
        cub.Ver();

        System.out.println("\nEsfera");
        esfera esf = new esfera();
        esf.setRadio(4.25);
        esf.calcularArea();
        esf.calcularVolumen();
        esf.Ver();

        System.out.println("\nPrisma triangular");
        prisma_triangular pristia = new prisma_triangular();
        pristia.setBase(5);
        pristia.setAltura(11.3);
        pristia.setLado(6);
        pristia.calcularArea();
        pristia.calcularVolumen();
        pristia.Ver();
    }

}
