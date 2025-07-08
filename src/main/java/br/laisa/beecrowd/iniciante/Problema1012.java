package br.laisa.beecrowd.iniciante;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Problema1012 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.000");
        Scanner leia = new Scanner(System.in);
        double A = leia.nextDouble();
        double B = leia.nextDouble();
        double C = leia.nextDouble();

        double areaTRetangulo = (A*C)/2;
        double areaCirculo = 3.14159*Math.pow(C, 2);
        double areaTrapezio = (A+B)*(C/2);
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A*B;

        System.out.println("TRIANGULO: " + format.format(areaTRetangulo));
        System.out.println("CIRCULO: " + format.format(areaCirculo));
        System.out.println("TRAPEZIO: " + format.format(areaTrapezio));
        System.out.println("QUADRADO: " + format.format(areaQuadrado));
        System.out.println("RETANGULO: " + format.format(areaRetangulo));
    }
}
