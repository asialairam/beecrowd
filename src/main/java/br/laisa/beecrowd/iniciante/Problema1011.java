package br.laisa.beecrowd.iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema1011 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.000");
        Scanner leia = new Scanner(System.in);
        double pi = 3.14159;
        double r = leia.nextDouble();
        double volume = ((4.0/3) * pi * Math.pow(r, 3));

        System.out.println("VOLUME = " + format.format(volume));
    }
}
