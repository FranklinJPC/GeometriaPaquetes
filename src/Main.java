import Geometria2D.*;
import Geometria3D.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("\tFIGURAS GEOMTRICAS");
        System.out.println("==========================");
        System.out.println("\tCirculo\n");
        System.out.print("Ingrese el radio: ");
        double radio = scn.nextDouble();
        circulo circulo = new circulo(radio);
        System.out.println("Perimetro: " + circulo.getPerimetro());
        System.out.println("Area: " + circulo.getArea());

        System.out.println("==========================");
        System.out.println("\tCuadrado\n");
        System.out.print("Ingrese el lado: ");
        double lado = scn.nextDouble();
        cuadrado cuad = new cuadrado(lado);
        System.out.println("Perimetro: " + cuad.getPerimetro());
        System.out.println("Area: " + cuad.getArea());

        System.out.println("==========================");
        System.out.println("\tEneagono\n");
        System.out.print("Ingrese el lado: ");
        double ladoE = scn.nextDouble();
        System.out.print("Ingrese el apotema: ");
        double apotemaE = scn.nextDouble();
        eneagono ene = new eneagono(ladoE, apotemaE);
        System.out.println("Perimetro: " + ene.getPerimetro());
        System.out.println("Area: " + ene.getArea());


        System.out.println("==========================");
        System.out.println("\tHeptagono\n");
        System.out.print("Ingrese el lado: ");
        double ladoHe = scn.nextDouble();
        System.out.print("Ingrese el apotema: ");
        double apotemaHe = scn.nextDouble();
        Heptagono hepta = new Heptagono(ladoHe, apotemaHe);
        System.out.println("Perimetro: " + hepta.getPerimetro());
        System.out.println("Area: " + hepta.getArea());

        System.out.println("==========================");
        System.out.println("\tHexagono\n");
        System.out.print("Ingrese el lado: ");
        double ladoHx = scn.nextDouble();
        System.out.print("Ingrese el apotema: ");
        double apotemaHx = scn.nextDouble();
        hexagono hexa = new hexagono(ladoHx, apotemaHx);
        System.out.println("Perimetro: " + hexa.getPerimetro());
        System.out.println("Area: " + hexa.getArea());


        System.out.println("==========================");
        System.out.println("\tTRIANGULO\n");
        System.out.print("Ingrese lado adyacente: ");
        double ladoAdy = scn.nextDouble();
        System.out.print("Ingrese lado opuesto: ");
        double ladoOp = scn.nextDouble();
        System.out.print("Ingrese la base: ");
        double baseTri = scn.nextDouble();
        System.out.print("Ingrese la altura: ");
        double alturaTri = scn.nextDouble();
        triangulo tri = new triangulo(ladoAdy, ladoOp, baseTri, alturaTri);
        System.out.println("Perimetro: " + tri.getPerimetro());
        System.out.println("Area: " + tri.getArea());

        System.out.println("==========================");
        System.out.println("\tTRAPEZOIDE\n");
        System.out.print("Ingrese base 1: ");
        double base1Tr = scn.nextDouble();
        System.out.print("Ingrese base 2: ");
        double base2Tr = scn.nextDouble();
        System.out.print("Ingrese el lado 1: ");
        double lado1Tr = scn.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        double lado2Tr = scn.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        double lado3Tr = scn.nextDouble();
        System.out.print("Ingrese el lado 4: ");
        double lado4Tr = scn.nextDouble();
        System.out.print("Ingrese la altura: ");
        double alturaTr = scn.nextDouble();
        trapezoide trap = new trapezoide(base1Tr, base2Tr, lado1Tr, lado2Tr, lado3Tr, lado4Tr, alturaTr);
        System.out.println("Perimetro: " + trap.getPerimetro());
        System.out.println("Area: " + trap.getArea());

        System.out.println("==========================");
        System.out.println("\tTRAPECIO\n");
        System.out.print("Ingrese la altura: ");
        double alturaTpc = scn.nextDouble();
        System.out.print("Ingrese el lado 1: ");
        double lado1Tpc = scn.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        double lado2Tpc = scn.nextDouble();
        System.out.print("Ingrese base mayor: ");
        double baseMTpc = scn.nextDouble();
        System.out.print("Ingrese base menor: ");
        double basemTpc = scn.nextDouble();
        trapecio pecio = new trapecio(alturaTpc, lado1Tpc, lado2Tpc, baseMTpc, basemTpc);
        System.out.println("Perimetro: " + pecio.getPerimetro());
        System.out.println("Area: " + pecio.getArea());

        System.out.println("==========================");
        System.out.println("\tPENTAGONO\n");
        System.out.print("Ingrese el lado: ");
        double ladoPe = scn.nextDouble();
        System.out.print("Ingrese el apotema: ");
        double apotemaPe = scn.nextDouble();
        pentagono penta = new pentagono(ladoPe, apotemaPe);
        System.out.println("Perimetro: " + penta.getPerimetro());
        System.out.println("Area: " + penta.getArea());

        System.out.println("==========================");
        System.out.println("\tOCTAGONO\n");
        System.out.print("Ingrese el lado: ");
        double ladoOc = scn.nextDouble();
        System.out.print("Ingrese el apotema: ");
        double apotemaOc = scn.nextDouble();
        octagono octa = new octagono(ladoOc, apotemaOc);
        System.out.println("Perimetro: " + octa.getPerimetro());
        System.out.println("Area: " + octa.getArea());


        System.out.println("==========================");
        System.out.println("\t\tFIGURAS 3D\n");
        System.out.println("==========================");
        System.out.println("\tTETRAEDRO\n");
        System.out.print("Ingrese la altura: ");
        double alturaTetra = scn.nextDouble();
        System.out.print("Ingrse el lado: ");
        double ladoTetra = scn.nextDouble();
        tetraedro tetra = new tetraedro(alturaTetra, ladoTetra);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + tetra.getArea());

        System.out.println("==========================");
        System.out.println("\tPRISMA CUADRANGULAR REGULAR\n");
        System.out.print("Ingrese la altura: ");
        double alturaPris = scn.nextDouble();
        System.out.print("Ingrse el area Base: ");
        double areaBasePris = scn.nextDouble();
        System.out.print("Ingrese el area lateral: ");
        double areaLateralPris = scn.nextDouble();
        prisma pris = new prisma(alturaPris, areaBasePris, areaLateralPris);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + pris.getArea());

        System.out.println("==========================");
        System.out.println("\tPIRAMIDE CUADRANGULAR \n");
        System.out.print("Ingrese la altura: ");
        double alturaPir = scn.nextDouble();
        System.out.print("Ingrse el lado: ");
        double ladoPir = scn.nextDouble();
        piramide pir = new piramide(ladoPir, alturaPir);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + pir.getArea());

        System.out.println("==========================");
        System.out.println("\tOCTAEDRO REGULAR\n");
        System.out.print("Ingrese la altura: ");
        double alturaOcte = scn.nextDouble();
        System.out.print("Ingrese el lado: ");
        double ladoOcte = scn.nextDouble();
        octaedro ocedro = new octaedro(alturaOcte, ladoOcte);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + ocedro.getArea());

        System.out.println("==========================");
        System.out.println("\tICOSAEDRO REGULAR\n");
        System.out.print("Ingrese la arista: ");
        double aristaIco = scn.nextDouble();
        icosaedro ico = new icosaedro(aristaIco);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + ico.getArea());

        System.out.println("==========================");
        System.out.println("\tCilindro\n");
        System.out.print("Ingrese el radio: ");
        double radioCil = scn.nextDouble();
        System.out.print("Ingrese la altura: ");
        double alturaCil = scn.nextDouble();
        cilindro cilin = new cilindro(alturaCil, radioCil);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + cilin.getArea());

        System.out.println("==========================");

        System.out.println("\tCono\n");
        System.out.print("Ingrese el radio: ");
        double radioCon = scn.nextDouble();
        System.out.print("Ingrese la altura: ");
        double alturaCon = scn.nextDouble();
        System.out.print("Ingrese la apertura: ");
        double aperturaCon = scn.nextDouble();
        cono con = new cono(radioCon, alturaCon, aperturaCon);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + con.getArea());

        System.out.println("==========================");

        System.out.println("\tCubo\t");
        System.out.print("Ingrese el lado: ");
        double ladoCub = scn.nextDouble();
        cubo cub = new cubo(ladoCub);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + cub.getArea());

        System.out.println("==========================");

        System.out.println("\tEsfera\n");
        System.out.print("Ingrese el radio: ");
        double radioEsf = scn.nextDouble();
        esfera esf = new esfera(radioEsf);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + esf.getArea());

        System.out.println("==========================");

        System.out.println("\tPrisma triangular\n");
        System.out.print("Ingrese la altura: ");
        double alturaPrTr = scn.nextDouble();
        System.out.print("Ingrese la base: ");
        double basePrTr = scn.nextDouble();
        System.out.print("Ingrese el lado: ");
        double ladoPrTr = scn.nextDouble();
        prisma_triangular pristia = new prisma_triangular(alturaPrTr, basePrTr, ladoPrTr);
        System.out.println("Volumen: " + tetra.getVolumen());
        System.out.println("Area: " + pristia.getArea());

        System.out.println("==========================");


    }
}